package io.zipcoder.interfaces;

import static java.lang.Long.MIN_VALUE;

public class Person extends People {

    private final Long id;
    private String name;

    public Person(Long id, String name) { //constructor
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}