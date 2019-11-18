package com.app01.spring.app01;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topics {

    private int id;
    private String name;
    private  String dep;
    private  String fac;

    public Topics() {

    }

    public Topics(int id, String name, String dep, String fac) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.fac = fac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }
}
