package com.example.practialtest.controller;

import com.example.practialtest.entity.Product;
import com.example.practialtest.responsitory.ProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductResponsitory productResponsitory;

    @RequestMapping(value = "list-product", method = RequestMethod.GET)
    public String listProduct(Model model) {
        List<Product> products =(List<Product>) productResponsitory.findAll();
        model.addAttribute("products", products);
        return "list-product";
    }
}
