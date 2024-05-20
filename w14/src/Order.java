public class Order {
    private int id;
    private String date;
    private String status;
    private double totalPayment;

    public Order(int id, String date, String status, double totalPayment) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.totalPayment = totalPayment;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void updateTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalPayment() {
        return totalPayment;
    }
}
