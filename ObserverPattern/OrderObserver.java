package ObserverPattern;

import DataModels.Order;

public interface OrderObserver {
    void update(Order order);
}
