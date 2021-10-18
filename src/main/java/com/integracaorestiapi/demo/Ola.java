package com.integracaorestiapi.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ola {

    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá Mundo!";
    }


}
