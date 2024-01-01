package com.example.person;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope ("porototype")
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        System.out.println("Person");
    }

}
