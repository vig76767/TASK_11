package com.example.guvipeoject11.Respository;

import com.example.guvipeoject11.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product,Long> {
}
