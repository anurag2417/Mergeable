package com.example.Mergeable.controller;

import com.example.Mergeable.model.Developer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperController {

    @GetMapping("/api/v1/developers")
    public Developer getDevloper() {
        return new Developer("1", "Anurag", "Kumar", "anurag.25bcs10513@sst.scaler.com", "6261737944");
    }
}
