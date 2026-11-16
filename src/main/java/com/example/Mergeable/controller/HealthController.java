package com.example.Mergeable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String getHealth(){
        return "Mergeable Application is Live and Healthy!!!";
    }

    @GetMapping("api/v1/status")
    public Map<String, Object> getStatus(){
        Map<String, Object> newMap = new HashMap<>();
        newMap.put("Status", "Live and Healthy");
        newMap.put("Application", "Mergeable");
        newMap.put("Version", "1.0.0");
        newMap.put("DateTime", LocalDateTime.now());

        return newMap;
    }

}
