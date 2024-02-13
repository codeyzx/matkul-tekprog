package soal1;

import java.util.Scanner;

public class Soal1 {

    public static String checkFitted(long number, String str) {
        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
            str = str.concat("|byte");
        if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
            str = str.concat("|short");
        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
            str = str.concat("|int");
        str = str.concat("|long");
        return str;
    }

    public static void printArray(String[] arr) {
        for (String str : arr) {
            if (!str.contains("|")) {
                System.out.println(str + " can't be fitted anywhere.");
                continue;
            }
            String[] temp = str.split("\\|");
            System.out.println(temp[0] + " can be fitted in:");
            for (int i = 1; i < temp.length; i++) {
                System.out.println("* " + temp[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] scan = new String[5];
        for (int i = 0; i < 5; i++) {
            scan[i] = scanner.nextLine();
        }

        String[] arr = new String[5];

        for (int i = 0; i < scan.length; i++) {
            try {
                arr[i] = checkFitted(Long.parseLong(scan[i]), scan[i]);
            } catch (Exception _) {
                arr[i] = scan[i];
            }
        }

        printArray(arr);

        scanner.close();
    }
}
