package com.tech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/user")
    public ResponseEntity<?> getUserDetails(@RequestParam(value = "userId", required = false, defaultValue = "foo") String userId){
        return ResponseEntity.ok("Welcome User: "+userId);
    }
}
