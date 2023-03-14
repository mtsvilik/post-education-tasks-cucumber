package com.solvd.posteducationtaskscucumber.saucedemo.db.service.impl;

import com.solvd.posteducationtaskscucumber.saucedemo.db.service.ProductService;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Product;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.exception.QueryException;
import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.ProductRepository;
import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.impl.ProductMapperImpl;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl() {
        this.productRepository = new ProductMapperImpl();
    }

    @Override
    public Product create(Product product) {
        product.setId(null);
        productRepository.create(product);
        return product;
    }

    @Override
    public Product read(Long id) {
        return productRepository.read(id)
                .orElseThrow(() -> new QueryException("No products found"));
    }

    @Override
    public void delete(Long deleteId) {
        productRepository.delete(deleteId);
    }
}
