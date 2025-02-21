package com.berkaltinok.spring_boot_product_seller.service;

import com.berkaltinok.spring_boot_product_seller.model.Product;

import java.util.List;

public interface ProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProduct();
}
