package com.example;

import java.io.Serializable;

/**
 * Created by chenh on 2017/5/2.
 */
public class Person implements Serializable{
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
