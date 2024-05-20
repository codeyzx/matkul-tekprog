import java.util.ArrayList;
import java.util.List;

public class LowCohesionManager {
    private List<Product> productList;
    private List<Order> orderList;

    public LowCohesionManager() {
        this.productList = new ArrayList<>();
        this.orderList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void deleteProduct(int productId) {
        // logika untuk menghapus produk
    }

    public void updateProduct(Product product) {
        // logika untuk memperbarui detail produk
    }

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

    public void fetchDataFromDatabase() {
        // logika untuk mengambil data dari database
    }

    public void performMathematicalOperation() {
        // logika untuk melakukan operasi matematika
    }

    public void sendEmailToCustomer() {
        // logika untuk mengirim email kepada pelanggan
    }
}
