package com.devtiro.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping(path="/hello")
    public String helloworld() {
        return "Hello World";
    }
}
