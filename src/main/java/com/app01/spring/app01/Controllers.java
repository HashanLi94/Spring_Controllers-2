package com.app01.spring.app01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controllers {
    @RequestMapping("/test/cont2")
    public List<Topics> helloController(){
        return Arrays.asList(
                new Topics(001, "Hashan", "CIS", "Applied"),
                new Topics(002, "Iressh", "Chemistry", "PST"),
                new Topics(003, "Mahesh", "Sport", "Applies")


        );
    }


}
