package com.example.breadcrumb.demo.domain.breadcrumb;

import java.util.Collections;
import java.util.List;

public class Breadcrumbs {
    List<Breadcrumb> list;

    public Breadcrumbs(List<Breadcrumb> list) {
        this.list = list;
    }

    public List<Breadcrumb> list() {
        return Collections.unmodifiableList(list);
    }
}
