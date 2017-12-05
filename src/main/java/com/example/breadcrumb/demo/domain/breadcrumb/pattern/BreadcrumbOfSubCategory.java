package com.example.breadcrumb.demo.domain.breadcrumb.pattern;

import com.example.breadcrumb.demo.domain.Category;
import com.example.breadcrumb.demo.domain.Shop;
import com.example.breadcrumb.demo.domain.SubCategory;
import com.example.breadcrumb.demo.domain.breadcrumb.Breadcrumb;

public class BreadcrumbOfSubCategory implements Breadcrumb {

    Shop shop;
    Category category;
    SubCategory subCategory;

    public BreadcrumbOfSubCategory(Shop shop, Category category, SubCategory subCategory) {
        this.shop = shop;
        this.category = category;
        this.subCategory = subCategory;
    }

    @Override
    public String text() {
        return subCategory.name();
    }

    @Override
    public String path() {
        return String.format("/shop/%s/category/%s/sub-category/%s/"
                , shop.code(), category.code(), subCategory.code());
    }

}