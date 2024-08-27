package com.example.addition_api.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api"
)
public class AdditionController {
    @PostMapping("/add")
    public Integer addNumbers(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + num2;
    }
}
