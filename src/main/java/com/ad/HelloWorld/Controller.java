package com.ad.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/")
    public @ResponseBody HelloWorld getMessage()
    {
        HelloWorld hw = new HelloWorld();
        hw.setMessage("Hello World");
        return hw;
    }
}