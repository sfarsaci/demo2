package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    private static Logger log = LoggerFactory.getLogger(SomeController.class);

    @GetMapping("/")
    public String handler() {
        log.info("james is the best");
        return "success";
    }
}
