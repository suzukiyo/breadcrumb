package com.example.breadcrumb.demo.domain.breadcrumb;

public interface Breadcrumb {
    String text();
    String path();

    default String title() {
        return String.format("%sのページへ移動する", text());
    }
}