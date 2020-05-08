package com.example.breadcrumb.demo.domain.shop;

public class SubCategory {
    String code;
    String name;

    public SubCategory(String code, String name) {
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
