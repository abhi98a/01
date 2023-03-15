package com.backend.springproject;

import jdk.jfr.ContentType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class HelloController {


        private ArrayList<String > list = new ArrayList<String>();
        @GetMapping("/Hello/{id}")
        public  String hello(@PathVariable String id){
            if(list.isEmpty()){
                return "Hello World !";
            }
            String greeting = list.get(Integer.parseInt(id));

            return  greeting;
        }

        @PostMapping("/greetings")

        public void greetings(@RequestParam String greeting){
            System.out.println("Greeting submitted" + greeting + "!");
            list.add(greeting);

        }


}
