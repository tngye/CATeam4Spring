package com.example.cateam4spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/admin_home").setViewName("Admin/admin_home");
        registry.addViewController("/student_home").setViewName("Student/student_home");
        registry.addViewController("/lecturer_home").setViewName("Lecturer/lecturer_home");
    }
}
