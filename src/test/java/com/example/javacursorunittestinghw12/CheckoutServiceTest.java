package com.example.javacursorunittestinghw12;

import com.example.javacursorunittestinghw12.repo.ProductRepository;
import com.example.javacursorunittestinghw12.service.CheckoutService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutServiceTest {
    private CheckoutService checkoutService;

    @BeforeEach
    public void setUp() {
        ProductRepository productRepository = new ProductRepository();
        checkoutService = new CheckoutService(productRepository);
    }

    @Test
    public void testCalculateTotalCost() {
        assertEquals(13.25, checkoutService.calculateTotalCost("ABCDABA"), 0.001);
        assertEquals(15.75, checkoutService.calculateTotalCost("AAABBB"), 0.001);
        assertEquals(12.50, checkoutService.calculateTotalCost("AAABBC"), 0.001);
        assertEquals(3.00, checkoutService.calculateTotalCost("AAA"), 0.001);
        assertEquals(2.50, checkoutService.calculateTotalCost("AA"), 0.001);
        assertEquals(5.00, checkoutService.calculateTotalCost("CCCCCC"), 0.001);
        assertEquals(0, checkoutService.calculateTotalCost(""), 0.001);
    }
}
