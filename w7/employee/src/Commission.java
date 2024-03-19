// Ini merupakan kelas yang mewarisi kelas Hourly.
public class Commission extends Hourly {
    // Variabel-variabel instance
    private double totalSales; // Merepresentasikan total penjualan yang dilakukan oleh karyawan
    private double commissionRate; // Merepresentasikan tingkat komisi untuk karyawan

    // Konstruktor
    public Commission(String name, String address, String phone, String socSecNumber, double rate,
            double commissionRate) {
        // Memanggil konstruktor dari kelas induk (Hourly) dengan 5 parameter pertama
        super(name, address, phone, socSecNumber, rate);
        // Menetapkan tingkat komisi menggunakan parameter ke-6
        this.commissionRate = commissionRate;
    }

    // Metode untuk menambahkan total penjualan
    public void addSales(double totalSales) {
        // Menambahkan parameter yang diberikan ke total penjualan
        this.totalSales += totalSales;
    }

    // Metode untuk menghitung pembayaran termasuk komisi
    @Override
    public double pay() {
        // Menghitung pembayaran untuk jam kerja menggunakan metode pay dari kelas induk
        double basePay = super.pay();
        // Menghitung komisi berdasarkan total penjualan dan tingkat komisi
        double commission = totalSales * commissionRate;
        // Mereset total penjualan (karena komisi dihitung sekali)
        totalSales = 0;
        // Mengembalikan total pembayaran (gaji pokok + komisi)
        return basePay + commission;
    }

    // Metode toString
    @Override
    public String toString() {
        // Memanggil metode toString dari kelas induk (Hourly) untuk mendapatkan
        // informasi dasar
        String parentToString = super.toString();
        // Menambahkan informasi total penjualan ke output toString dari induk
        return parentToString + "\nTotal Sales: " + totalSales;
    }
}
