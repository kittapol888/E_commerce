package StrategyPattern;
import DataModels.*;

public class PercentageDiscount implements DiscountStrategy{
    private final double percentage;
    

    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(Order order){
        return order.getTotalPrice() * (1.0 - percentage / 100.0);
    }
}
