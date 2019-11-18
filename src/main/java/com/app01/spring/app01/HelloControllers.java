package com.app01.spring.app01;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloControllers {
    @RequestMapping(value = "/test/HelloControllers")
    public String hellControllers(){
        return "Redirect to the next controller";
    }

    @PostMapping(value = "/testPost")
    public String postTest(@RequestBody String s){
        System.out.println(s);
        return s;
    }
}
