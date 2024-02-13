import soal1.Soal1;
import soal2.Constants;
import soal2.Constants2;
import soal3.FloatingPoint;
import soal4.ConvertDataType;
import soal5.SoalStrings;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Soal 1");
        Soal1.main(args);

        System.out.println("Soal 2");
        System.out.print("Constants: ");
        Constants.main();
        System.out.print("Constants2: ");
        Constants2.main();

        // tidak menggunakan static
        // Constants constants = new Constants();
        // ini dapat diakses dengan syarat CM_PER_INCH merupakan instance variable dan
        // merupakan public variable
        // System.out.println(constants.CM_PER_INCH);

        // error karna CM_PER_INCH bukan static dan bukan merupakan instance variable
        // System.out.println(Constants.CM_PER_INCH);

        // menggunakan static
        // System.out.println(Constants2.CM_PER_INCH);

        System.out.println("Soal 3");
        FloatingPoint.main();

        System.out.println("Soal 4");
        ConvertDataType.main();

        System.out.println("Soal 5");
        SoalStrings.main(args);

    }
}
