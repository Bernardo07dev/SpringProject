package com.fiap.trying_spring.controller;
import com.fiap.trying_spring.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String hello (){
        return helloWorldService.helloWorld("Bebe");
    }

    @PostMapping("/{id}")
    public String helloPost (
            @PathVariable String id,
            @RequestParam(value = "value", defaultValue = "nada") String value,
            @RequestBody String body) {
        return "Ola " + body + " " + id + " " + value;
    }
}
