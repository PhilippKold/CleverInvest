package org.tensorflow.demo;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Dmitrijs Nesterenko on 05.10.17.
 */

public class StringHelper {
    public static String formatDecimal(double number) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        return formatter.format(number);
    }

    public static String formatDecimal(float number) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        return formatter.format(number);
    }
}
