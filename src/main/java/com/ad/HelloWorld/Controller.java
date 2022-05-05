package com.ad.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/")
    public @ResponseBody helloworld getMessage()
    {
        helloworld hw = new helloworld();
        hw.setMessage("Hello World");
        return hw;
    }
}