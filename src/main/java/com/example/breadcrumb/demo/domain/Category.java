package com.example.breadcrumb.demo.domain;

public class Category {
    String code;
    String name;

    public Category(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String code() {
        return code;
    }

    public String name() {
        return name;
    }
}
