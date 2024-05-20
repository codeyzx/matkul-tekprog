import java.util.ArrayList;
import java.util.List;

public class HighCohesionManager {
    private List<Product> productList;
    private List<Order> orderList;

    public HighCohesionManager() {
        this.productList = new ArrayList<>();
        this.orderList = new ArrayList<>();
    }

    // Metode-metode terkait dengan pengelolaan produk
    public void addProduct(Product product) {
        productList.add(product);
    }

    public void deleteProduct(int productId) {
        // logika untuk menghapus produk
    }

    public void updateProduct(Product product) {
        // logika untuk memperbarui detail produk
    }

    // Metode-metode terkait dengan pengelolaan pesanan
    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void updateOrderStatus(int orderId, String status) {
        // logika untuk mengubah status pesanan
    }

    public double calculateTotalPayment(Order order) {
        // logika untuk menghitung total pembayaran pesanan
        return 0.0;
    }
}
