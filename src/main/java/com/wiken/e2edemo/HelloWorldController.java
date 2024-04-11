package com.wiken.e2edemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
    public String sayHello() {
        return "Hi. Welcome to CNA cloud apps - CodeDeploy By Jenkins -v1.0";
    }

}
