package com.example.breadcrumb.demo.domain.breadcrumb;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BreadcrumbFactory {
    public static Breadcrumbs create(Breadcrumb ...breadcrumbs){
        List<Breadcrumb> list = Arrays.stream(breadcrumbs)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return new Breadcrumbs(list);
    }
}
