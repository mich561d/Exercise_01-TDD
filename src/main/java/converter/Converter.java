package main.java.converter;

import java.util.InputMismatchException;

public class Converter {

    private static final int MAX_NUMBER = 3999;
    private static final int MIN_NUMBER = 1;

    public static String arabicNumeralToRomanNumeral(int arabicNumeral) {
        if (arabicNumeral > MAX_NUMBER || arabicNumeral < MIN_NUMBER) {
            throw new InputMismatchException("Main: Number does not meet criterias");
        }

        int thousands = arabicNumeral / 1000;
        int hundreds = (arabicNumeral % 1000) / 100;
        int tens = ((arabicNumeral % 1000) % 100) / 10;
        int ones = ((arabicNumeral % 1000) % 100) % 10;

        String result = "";
        result += arabicNumeralToRomanNumeralThousands(thousands);
        result += arabicNumeralToRomanNumeralHundreds(hundreds);
        result += arabicNumeralToRomanNumeralTens(tens);
        result += arabicNumeralToRomanNumeralOnes(ones);
        return result;
    }

    private static String arabicNumeralToRomanNumeralThousands(int thousands) {
        return switch (thousands) {
            case 0, 1, 2, 3 -> "M".repeat(thousands);
            default -> throw new InputMismatchException("Thousands: Number does not meet criterias");
        };
    }

    private static String arabicNumeralToRomanNumeralHundreds(int hundreds) throws InputMismatchException {
        return switch (hundreds) {
            case 0, 1, 2, 3 -> "C".repeat(hundreds);
            case 4 -> "CD";
            case 5, 6, 7, 8 -> "D" + "C".repeat(hundreds - 5);
            case 9 -> "CM";
            default -> throw new InputMismatchException("Hundreds: Number does not meet criterias");
        };
    }

    private static String arabicNumeralToRomanNumeralTens(int tens) throws InputMismatchException {
        return switch (tens) {
            case 0, 1, 2, 3 -> "X".repeat(tens);
            case 4 -> "XL";
            case 5, 6, 7, 8 -> "L" + "X".repeat(tens - 5);
            case 9 -> "XC";
            default -> throw new InputMismatchException("Tens: Number does not meet criterias");
        };
    }

    private static String arabicNumeralToRomanNumeralOnes(int ones) throws InputMismatchException {
        return switch (ones) {
            case 0, 1, 2, 3 -> "I".repeat(ones);
            case 4 -> "IV";
            case 5, 6, 7, 8 -> "V" + "I".repeat(ones - 5);
            case 9 -> "IX";
            default -> throw new InputMismatchException("Ones: Number does not meet criterias");
        };
    }
}
