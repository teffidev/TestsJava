package com.platzi.javatests.util.TDD_discounts;

import java.util.ArrayList;

public class PriceCalculator {

    private ArrayList<Double> prices = new ArrayList<>();
    private double discount = 0;

    public double getTotal(){
        double result = 0.0;
        for (Double price : prices) {
            result += price;
        }
        return result * ((100 - discount) / 100);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
