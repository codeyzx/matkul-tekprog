public class Cashier extends AbstractStoreEmployee {

    public Cashier(double numberOfHoursWorked, double hourlyRate, String storeDetails,
            double basePay, String employeeName) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
    }

    @Override
    public double calculatePay() {
        return getBasePay() + (getNumberOfHoursWorked() * getHourlyRate());
    }

    @Override
    public boolean checkPromotionEligibility() {
        return getNumberOfHoursWorked() > 1000;
    }

    @Override
    public double calculateCommission() {
        return 0;
    }

    @Override
    public double calculateRemainingStoreRevenue(double storeSales) {
        double employeePay = calculatePay();
        double storeRevenue = 0;

        storeRevenue = storeSales * (1 - TAX) - employeePay;

        if (storeSales > 255000) {
            storeRevenue = (1 - 0.05) * storeRevenue;
        } else if (storeSales > 155000 && storeSales <= 255000) {
            storeRevenue = (1 - 0.03) * storeRevenue;
        } else {
            storeRevenue = (1 - 0.01) * storeRevenue;
        }
        return storeRevenue;
    }

    // ** Method baru yang ditambahkan
    @Override
    public double calculateBonus() {
        // Logika untuk menghitung bonus Cashier
        // Misalnya, tidak ada bonus untuk Cashier
        return 0;
    }

    @Override
    public double calculateStoreTax(double storeSales) {
        return storeSales * TAX; // Hitung jumlah pajak toko
    }
}
