package com.bitlab.beans.config;

import com.bitlab.beans.services.TaskService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBUtil {

    @Bean
    public TaskService taskService(){
        return new TaskService();
    }
}
