package com.ad.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @RequestMapping("/")
    public HelloWorld getMessage()
    //public @ResponseBody HelloWorld getMessage()
    {
        HelloWorld hw = new HelloWorld();
        hw.setMessage("Hello World");
        return hw;
    }
}