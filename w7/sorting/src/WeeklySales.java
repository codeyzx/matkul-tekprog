
// ************************************************************* 
// WeeklySales.java 
// 
// Sorts the sales staff in descending order by sales. 
// ************************************************************ 
import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        int numberOfSalespeople = scan.nextInt();

        Salesperson[] salesStaff = new Salesperson[numberOfSalespeople];
        for (int i = 0; i < numberOfSalespeople; i++) {
            System.out.println("Enter details for Salesperson #" + (i + 1));
            System.out.print("First Name: ");
            String firstName = scan.next();
            System.out.print("Last Name: ");
            String lastName = scan.next();
            System.out.print("Total Sales: ");
            int totalSales = scan.nextInt();

            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}