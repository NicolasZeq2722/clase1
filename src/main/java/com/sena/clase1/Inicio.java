package com.sena.clase1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


    @RestController
public class Inicio {

    @GetMapping("/")
    public String metodoGet() {
        return new String("Hola mundo, bienvenido a GetMapping");
    }

    @PostMapping("/Post")
    public String metodoPost() {
        return new String("PostMapping");
    }

    @PutMapping("/Put")
    public String metodoPut() {
        return new String("PutMapping");
    }

    @DeleteMapping("/Delete")
    public String metodoDelete() {
        return new String("DeleteMapping");
    }

    @PatchMapping("/Path")
    public String metodoPatch() {
        return new String("PatchMapping");
    }

}