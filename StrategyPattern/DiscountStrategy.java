package StrategyPattern;
import DataModels.*;

public interface DiscountStrategy {
   public double applyDiscount(Order order);
}
