package com.example.breadcrumb.demo.domain.shop;

public class Shop {
    String code;
    String name;

    public Shop(String code, String name) {
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
