package com.example.guvipeoject11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long ProductId;
    @Column(name = "product_name")
    private String ProductName;
    @Column(name = "product_price")
    private int ProductPrice;
    @Column(name = "product_category")
    private String Productcategory;
}
