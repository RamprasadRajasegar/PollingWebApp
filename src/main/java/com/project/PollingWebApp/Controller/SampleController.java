package com.project.PollingWebApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SampleController {

    @GetMapping("sample")
    public static String sample(String sample ){
        return "sample";
    }
}
