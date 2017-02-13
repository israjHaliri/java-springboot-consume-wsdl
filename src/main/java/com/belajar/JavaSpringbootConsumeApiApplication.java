package com.belajar;

import com.belajar.repository.UserProfileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaSpringbootConsumeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringbootConsumeApiApplication.class, args);
    }
    
    @Bean
    public UserProfileRepository userProfileRepository() {
        return new UserProfileRepository();
    }
    
}
