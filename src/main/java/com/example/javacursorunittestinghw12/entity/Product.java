package com.example.javacursorunittestinghw12.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private char code;
    private double price;
    private Integer promoQuantity;
    private Double promoPrice;
}
