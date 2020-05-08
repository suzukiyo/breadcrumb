package com.example.breadcrumb.demo.domain.breadcrumb.pattern;

import com.example.breadcrumb.demo.domain.shop.Shop;
import com.example.breadcrumb.demo.domain.breadcrumb.Breadcrumb;

public class BreadcrumbOfShop implements Breadcrumb {

    Shop shop;

    public BreadcrumbOfShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String text() {
        return shop.name();
    }

    @Override
    public String path() {
        return String.format("/shop/%s/", shop.code());
    }

}