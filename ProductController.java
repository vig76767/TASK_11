package com.example.guvipeoject11.Controller;

import com.example.guvipeoject11.Entity.Product;
import com.example.guvipeoject11.Service.Serviceimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class ProductController {
    @Autowired
    private Serviceimple serviceimple;

    @GetMapping("/index")
    public String firstPage(Model modal){
        return "index";
    }

    @GetMapping("/add")
    public String addProduct(Model model){
        model.addAttribute("product",new Product());
        return "AddProduct";
    }

    @PostMapping("/add")
    public String addproducts(@ModelAttribute Product product, Model model){
        serviceimple.addproduct(product);
        model.addAttribute("message"," Product add successfully!");
        return "AddProduct";
    }


    @GetMapping("/view")
    public String viewProduct(Model model){
        List<Product> viewall = serviceimple.view();
        model.addAttribute("displayall",viewall);
        return "viewProduct";
    }
}
