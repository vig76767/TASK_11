package com.example.guvipeoject11.Service;

import com.example.guvipeoject11.Entity.Product;
import com.example.guvipeoject11.Respository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Serviceimple implements  imple{

    @Autowired
    private ProductRespository productRespository;
    @Override
    public Product addproduct(Product product) {
        return productRespository.save(product);
    }

    @Override
    public List<Product> view() {
        return productRespository.findAll();
    }
}
