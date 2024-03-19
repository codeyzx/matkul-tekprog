// ******************************************************* 
// Salesperson.java 
// 
// Represents a sales person who has a first name, last 
// name, and total number of sales. 
// ******************************************************* 
public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    // ------------------------------------------------------
    // Constructor: Sets up the sales person object with
    // the given data.
    // ------------------------------------------------------
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // -------------------------------------------
    // Returns the sales person as a string.
    // -------------------------------------------
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // -------------------------------------------
    // Returns true if the sales people have
    // the same name.
    // -------------------------------------------
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // --------------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    // --------------------------------------------------
    public int compareTo(Object other) {
        if (!(other instanceof Salesperson)) {
            throw new IllegalArgumentException("Argument harus berupa Salesperson");
        }

        Salesperson otherSalesperson = (Salesperson) other;

        // Membandingkan total sales
        if (this.totalSales != otherSalesperson.totalSales) {
            return this.totalSales - otherSalesperson.totalSales;
        }

        // Jika total sales sama, gunakan last name untuk memecahkan tie
        int lastNameComparison = this.lastName.compareTo(otherSalesperson.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        // Jika last name sama, gunakan first name untuk memecahkan tie
        return this.firstName.compareTo(otherSalesperson.firstName);
    }

    // -------------------------
    // First name accessor.
    // -------------------------
    public String getFirstName() {
        return firstName;
    }

    // -------------------------
    // Last name accessor.
    // -------------------------
    public String getLastName() {
        return lastName;
    }

    // -------------------------
    // Total sales accessor.
    // -------------------------
    public int getSales() {
        return totalSales;
    }
}
