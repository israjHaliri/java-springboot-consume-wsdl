/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.controller;

import com.belajar.config.RestTemplateConfig;
import com.belajar.domain.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeArray.map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author israjhaliri
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApiRestTest {

    @Autowired
    RestTemplateConfig restTemplateConfig;

    @Test
    public void testGetData() {
        String uri = "http://localhost:8001/api/rest/get";
        Map<String, Object> data = restTemplateConfig.restTemplate().getForObject(uri, Map.class);
        System.out.println("========== Hasil Data ============");
        System.out.println("all data = " + data);
        System.out.println("id = " + data.get("id"));
        System.out.println("username = " + data.get("username"));
        System.out.println("password = " + data.get("password"));
        System.out.println("file name = " + data.get("fileName"));
        System.out.println("file path = " + data.get("filePath"));
        System.out.println("file size = " + data.get("fileSize"));
        System.out.println("file type = " + data.get("fileType"));
        System.out.println("========== Hasil Data ============");
        Assert.assertEquals(7L, data.size());
    }

    @Test
    public void testGetDataById() {
        String uri = "http://localhost:8001/api/rest/get_by_id/1";
        Map<String, Object> data = restTemplateConfig.restTemplate().getForObject(uri, Map.class);
        System.out.println("========== Hasil Data ============");
        System.out.println("all data = " + data);
        System.out.println("id = " + data.get("id"));
        System.out.println("username = " + data.get("username"));
        System.out.println("password = " + data.get("password"));
        System.out.println("file name = " + data.get("fileName"));
        System.out.println("file path = " + data.get("filePath"));
        System.out.println("file size = " + data.get("fileSize"));
        System.out.println("file type = " + data.get("fileType"));
        System.out.println("========== Hasil Data ============");
        Assert.assertEquals(7L, data.size());
    }

    @Test
    public void testPostDataDomain() {
        String uri = "http://localhost:8001/api/rest/post_domain";

        User user = new User();
        user.setFileName("name file");
        user.setId("1");
        user.setFilePath("c:/test");
        user.setFileSize(30L);
        user.setFileType("txt");
        user.setPassword("pwd");
        user.setUsername("israj");

        User data = restTemplateConfig.restTemplate().postForObject(uri, user, User.class);
        System.out.println("========== Hasil Data ============");
        System.out.println("all data = " + data.getFileName());
        Assert.assertNotNull(data);
    }
    
    @Test
    public void testPutDataDomain() {
        String uri = "http://localhost:8001/api/rest/put_domain";

        User user = new User();
        user.setFileName("name file");
        user.setId("1");
        user.setFilePath("c:/test");
        user.setFileSize(30L);
        user.setFileType("txt");
        user.setPassword("pwd");
        user.setUsername("israj");

        Map<String, String> params = new HashMap<String, String>();
        restTemplateConfig.restTemplate().put(uri, user, params);
    }
    
    @Test
    public void testPostData() {
        String uri = "http://localhost:8001/api/rest/post";
        MultipartFile file = null;
        
        LinkedMultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("username", "israj");
        params.add("password", "pwd");
        params.add("attachment", file);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<>(params, headers);
        
        Map data = restTemplateConfig.restTemplate().postForObject(uri, params, Map.class);
        System.out.println("========== Hasil Data ============");
        System.out.println("all data = " + data.get("username"));
        System.out.println("all data = " + data.get("fileName"));
        Assert.assertNotNull(data);
    }
    

    @Test
    public void TestdeleteData() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("username", "israj");
        String url = "http://localhost:8001/api/rest/delete/1";
        try {
            restTemplateConfig.restTemplate().delete(url, params);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
