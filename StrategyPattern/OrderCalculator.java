package StrategyPattern;
import DataModels.*;

public class OrderCalculator {
    public double calculateFinalPrice(Order order, DiscountStrategy strategy){
        return  strategy.applyDiscount(order);

    }
}
