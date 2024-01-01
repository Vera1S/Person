package com.example.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonApplication {

    public static void main(String[] args) {

        SpringApplication.run(PersonApplication.class, args);
        Person person = new Person();
        Person secondPerson = new Person();

        System.out.println("Person is created ");
    }

}
