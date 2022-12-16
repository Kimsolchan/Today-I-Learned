package com.example.springmvcprac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// @RestController
// @Controller + @ResponseBody
// @RestController 어노태이션이 있으면 모든 메서드에 @ResponseBody 어노테이션이 적용된다.
@RestController
@RequestMapping("/rest")
public class RestControllerPrac {
    @GetMapping("/json/string")
    public String restcontrollerHtmlString() {
        return "<html><body>RestControllerPrac @ResponseBody</body></html>";
    }

    @GetMapping("/json/list")
    public List<String> restcontrollerJson() {
        List<String> list = Arrays.asList("Rest Controller", "result : JSON 형식");

        return list;
    }
}

