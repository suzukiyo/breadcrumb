package com.example.breadcrumb.demo.domain.breadcrumb.pattern;

import com.example.breadcrumb.demo.domain.shop.Category;
import com.example.breadcrumb.demo.domain.shop.Shop;
import com.example.breadcrumb.demo.domain.breadcrumb.Breadcrumb;

public class BreadcrumbOfCategory implements Breadcrumb {

    Shop shop;
    Category category;

    public BreadcrumbOfCategory(Shop shop, Category category) {
        this.shop = shop;
        this.category = category;
    }

    @Override
    public String text() {
        return category.name();
    }

    @Override
    public String path() {
        return String.format("/shop/%s/category/%s", shop.code(), category.code());
    }

}