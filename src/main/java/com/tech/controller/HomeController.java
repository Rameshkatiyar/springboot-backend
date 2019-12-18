package com.tech.controller;

import com.tech.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin //For Cross Origin, follow it: https://stackoverflow.com/questions/35091524/spring-cors-no-access-control-allow-origin-header-is-present
@RestController
public class HomeController {

    @GetMapping(value = "/user")
    public ResponseEntity<?> getUserDetails(@RequestParam(value = "userId", required = false, defaultValue = "12345") String userId){
        log.info("Sending Response For User: {}", userId);
        User user = User.builder()
                .userId(userId)
                .firstName("Seth")
                .lastName("Tim")
                .build();
        return ResponseEntity.ok(user);
    }
}
