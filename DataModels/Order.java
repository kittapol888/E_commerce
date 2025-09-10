package DataModels;
import java.util.List;

public record Order(String orderId, List<Product> products, String customerEmail){
    public double getTotalPrice(){
        double total = 0;
        for(Product p : products) {
            total += p.price();
        }
        return total;
    }
}
