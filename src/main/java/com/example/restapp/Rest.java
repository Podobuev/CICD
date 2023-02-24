package com.example.restapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Rest {

    @GetMapping()
    public String testKuber() {
        return "Проверка докер____________________";
    }

}
