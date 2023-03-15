package com.backend.springproject;

import jdk.jfr.ContentType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

        @GetMapping("/Hello/{id}")

        public  String hello(@PathVariable String id){
            return  "Hello World" + id + "!";
        }


}
