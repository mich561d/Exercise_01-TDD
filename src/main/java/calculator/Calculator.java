package main.java.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    public static double fahrenheitToCelcius(double fahrenheit) {
        return roundDouble((fahrenheit - 32.0) * (5.0 / 9.0));
    }

    public static double celciusToFahrenheit(double celcius) {
        return roundDouble((celcius * (9.0 / 5.0)) + 32.0);
    }

    private static double roundDouble(double value) {
        int places = 1;
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
