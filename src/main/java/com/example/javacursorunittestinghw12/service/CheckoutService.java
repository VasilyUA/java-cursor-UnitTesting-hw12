package com.example.javacursorunittestinghw12.service;

import com.example.javacursorunittestinghw12.entity.Product;
import com.example.javacursorunittestinghw12.repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CheckoutService {
    private final ProductRepository productRepository;

    public CheckoutService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public double calculateTotalCost(String basket) {
        Map<Character, Integer> productCounts = countProductCodes(basket);

        double totalCost = 0.0;
        for (Map.Entry<Character, Integer> entry : productCounts.entrySet()) {
            Product product = productRepository.findByCode(entry.getKey());

            if (product != null) {
                totalCost += calculateProductCost(product, entry.getValue());
            }
        }
        return totalCost;
    }

    private Map<Character, Integer> countProductCodes(String basket) {
        Map<Character, Integer> productCounts = new HashMap<>();
        for (char productCode : basket.toCharArray()) {
            productCounts.put(productCode, productCounts.getOrDefault(productCode, 0) + 1);
        }
        return productCounts;
    }

    private double calculateProductCost(Product product, int count) {
        double cost = 0.0;
        if (product.getPromoQuantity() != null && count >= product.getPromoQuantity()) {
            cost += count / product.getPromoQuantity() * product.getPromoPrice();
            count %= product.getPromoQuantity();
        }
        cost += count * product.getPrice();
        return cost;
    }
}
