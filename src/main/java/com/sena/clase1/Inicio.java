package com.sena.clase1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



    @RestController
public class Inicio {

    @GetMapping("/")
    public String getMethodName() {
        return new String("Hola mundo, bienvenido a mi primer proyecto de springboot");
    }

}


    