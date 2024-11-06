import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1", "kampas ganda", 4000000, "Spare part", 10);
        Product product2 = new Product("2", "kampas ganda", 200000, "Spare part", 50);

        User user = new User("io1", "Chesta", "Chesta@example.com", "kadalgurun123");

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1, 1);
        cart.addProduct(product2, 2);

        System.out.println("Total Harga: " + cart.calculateTotal());

        List<Product> productList = new ArrayList<>(cart.getItems().keySet());
        Order order = new Order("1", user, productList);

        System.out.println("Total Harga Pesanan: " + order.getTotalAmount());
    }
}

