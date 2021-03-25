package com.legosoft.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {


    @GetMapping("/{nombre}")
    public ResponseEntity<String> sayHello(@PathVariable("nombre") String nombre) {
        System.out.println("Peticion reicibida durante presentacion...");
        return new ResponseEntity("hello " +  nombre + "!", HttpStatus.OK);
    }
}
