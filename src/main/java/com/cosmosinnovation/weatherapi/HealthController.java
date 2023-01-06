package com.cosmosinnovation.weatherapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/")
    public ResponseEntity<?> checkHealthstatus() {
        Map<String, String> data = new HashMap<>();
        data.put("message", "OK");
        return ResponseEntity.ok(data);
    }
}
