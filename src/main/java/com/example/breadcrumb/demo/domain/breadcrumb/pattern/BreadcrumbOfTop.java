package com.example.breadcrumb.demo.domain.breadcrumb.pattern;

import com.example.breadcrumb.demo.domain.breadcrumb.Breadcrumb;

public class BreadcrumbOfTop implements Breadcrumb {

    @Override
    public String text() {
        return "TOP";
    }

    @Override
    public String path() {
        return "/";
    }

}