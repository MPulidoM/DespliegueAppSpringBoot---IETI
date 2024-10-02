package edu.eci.ieti.myname.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myname")
public class MyNameController {
    
    @GetMapping
    public String myname() {
        return "Hello my name is Mariana Pulido , 0-0 ";
    }

}
