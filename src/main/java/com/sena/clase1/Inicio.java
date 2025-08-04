package com.sena.clase1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;




    @RestController
public class Inicio {

    @GetMapping("/")
    public String getMethodName1() {
        return new String("Hola mundo, bienvenido a mi primer proyecto de springboot");
    }

    @GetMapping("/Inicio")
    public String getMethodName2() {
        return new String("Hola mundo, bienvenido a mi segundo getMapping");
    }
    

}


    