package com.example.javacursorunittestinghw12.repo;

import com.example.javacursorunittestinghw12.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    private final Map<Character, Product> products = new HashMap<>();

    public ProductRepository() {
        products.put('A', new Product('A', 1.25, 3, 3.00));
        products.put('B', new Product('B', 4.25, null, null));
        products.put('C', new Product('C', 1.00, 6, 5.00));
        products.put('D', new Product('D', 0.75, null, null));
    }

    public Product findByCode(char code) {
        return products.get(code);
    }
}
