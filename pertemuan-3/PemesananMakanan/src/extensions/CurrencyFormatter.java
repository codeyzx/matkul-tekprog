package extensions;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static String toCurrency(double price) {
        Locale locale = new Locale.Builder().setLanguage("id").setRegion("ID").build();
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(locale);
        decimalFormat.setMinimumFractionDigits(0);
        return decimalFormat.format(price);
    }
}