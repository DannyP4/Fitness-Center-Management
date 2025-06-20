package com.example.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Cho phép tất cả các đường dẫn
                .allowedOrigins("http://localhost:3000", "http://localhost:5173") // Chỉ định nguồn được phép (thay bằng URL của React Admin)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Các phương thức HTTP được phép
                .allowedHeaders("*")
                .allowCredentials(true); // Cho phép tất cả các header
    }
}