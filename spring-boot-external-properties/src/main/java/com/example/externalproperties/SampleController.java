package com.example.externalproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Value("${sample.message}")
    private String message;


    @GetMapping
    @ResponseBody
    public String getMessage() {
        return "The message is: ".concat(message);
    }


}
