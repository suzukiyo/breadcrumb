package com.example.breadcrumb.demo.presentation.controller;

import com.example.breadcrumb.demo.domain.Category;
import com.example.breadcrumb.demo.domain.Shop;
import com.example.breadcrumb.demo.domain.SubCategory;
import com.example.breadcrumb.demo.domain.breadcrumb.BreadcrumbFactory;
import com.example.breadcrumb.demo.domain.breadcrumb.Breadcrumbs;
import com.example.breadcrumb.demo.domain.breadcrumb.pattern.BreadcrumbOfCategory;
import com.example.breadcrumb.demo.domain.breadcrumb.pattern.BreadcrumbOfShop;
import com.example.breadcrumb.demo.domain.breadcrumb.pattern.BreadcrumbOfSubCategory;
import com.example.breadcrumb.demo.domain.breadcrumb.pattern.BreadcrumbOfTop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping
    String index(Model model) {

        Shop shop = new Shop("thenorthface", "the north face");
        Category category = new Category("bag", "バッグ");
        SubCategory subCategory = new SubCategory("tote-bag", "トートバッグ");

        Breadcrumbs breadcrumbs = BreadcrumbFactory.create(
                new BreadcrumbOfTop(),
                new BreadcrumbOfShop(shop),
                new BreadcrumbOfCategory(shop, category),
                new BreadcrumbOfSubCategory(shop, category, subCategory)
        );

        model.addAttribute("breadcrumbs", breadcrumbs);

        return "/index";
    }
}
