package test.java.converter;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import main.java.converter.Converter;

import java.util.InputMismatchException;

public class ArabicNumeralToRomanNumeralTest {

    @org.junit.jupiter.api.Test
    void OneMustGiveI() {
        // Arrange
        int number = 1;
        String expected = "I";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void TwoMustGiveII() {
        // Arrange
        int number = 2;
        String expected = "II";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void ThreeMustGiveIII() {
        // Arrange
        int number = 3;
        String expected = "III";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void FourMustGiveIV() {
        // Arrange
        int number = 4;
        String expected = "IV";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void FiveMustGiveV() {
        // Arrange
        int number = 5;
        String expected = "V";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void SixMustGiveVI() {
        // Arrange
        int number = 6;
        String expected = "VI";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void SevenMustGiveVII() {
        // Arrange
        int number = 7;
        String expected = "VII";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void EightMustGiveVIII() {
        // Arrange
        int number = 8;
        String expected = "VIII";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void NineMustGiveIX() {
        // Arrange
        int number = 9;
        String expected = "IX";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void TenMustGiveX() {
        // Arrange
        int number = 10;
        String expected = "X";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void TwentyMustGiveXX() {
        // Arrange
        int number = 20;
        String expected = "XX";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void ThirtyMustGiveXXX() {
        // Arrange
        int number = 30;
        String expected = "XXX";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void FortyMustGiveXL() {
        // Arrange
        int number = 40;
        String expected = "XL";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void FiftyMustGiveL() {
        // Arrange
        int number = 50;
        String expected = "L";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void SixtyMustGiveLX() {
        // Arrange
        int number = 60;
        String expected = "LX";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void SeventyMustGiveLXX() {
        // Arrange
        int number = 70;
        String expected = "LXX";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void EightyMustGiveLXXX() {
        // Arrange
        int number = 80;
        String expected = "LXXX";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void NinetyMustGiveXC() {
        // Arrange
        int number = 90;
        String expected = "XC";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void OneHundredMustGiveC() {
        // Arrange
        int number = 100;
        String expected = "C";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void TwoHundredMustGiveC() {
        // Arrange
        int number = 200;
        String expected = "CC";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void ThreeHundredMustGiveCCC() {
        // Arrange
        int number = 300;
        String expected = "CCC";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void FourHundredMustGiveCD() {
        // Arrange
        int number = 400;
        String expected = "CD";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void FiveHundredMustGiveD() {
        // Arrange
        int number = 500;
        String expected = "D";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void SixHundredMustGiveDC() {
        // Arrange
        int number = 600;
        String expected = "DC";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void SevenHundredMustGiveDCC() {
        // Arrange
        int number = 700;
        String expected = "DCC";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void EightHundredMustGiveDCCC() {
        // Arrange
        int number = 800;
        String expected = "DCCC";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void NineHundredMustGiveCM() {
        // Arrange
        int number = 900;
        String expected = "CM";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void OneThousandsMustGiveM() {
        // Arrange
        int number = 1000;
        String expected = "M";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void TwoThousandsMustGiveMM() {
        // Arrange
        int number = 2000;
        String expected = "MM";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void ThreeThousandsMustGiveMMM() {
        // Arrange
        int number = 3000;
        String expected = "MMM";
        // Act
        String result = Converter.arabicNumeralToRomanNumeral(number);
        // Assert
        Assert.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void ZeroMustThrowException() {
        // Arrange
        int number = 0;
        // Assert
        Assertions.assertThrows(InputMismatchException.class, () -> {
            // Act
            Converter.arabicNumeralToRomanNumeral(number);
        });
    }

    @org.junit.jupiter.api.Test
    void LessThanZeroMustThrowException() {
        // Arrange
        int number = -1;
        // Assert
        Assertions.assertThrows(InputMismatchException.class, () -> {
            // Act
            Converter.arabicNumeralToRomanNumeral(number);
        });
    }

    @org.junit.jupiter.api.Test
    void MoreThanThreeThousandsNineHundredNintyNineMustThrowException() {
        // Arrange
        int number = 4000;
        // Assert
        Assertions.assertThrows(InputMismatchException.class, () -> {
            // Act
            Converter.arabicNumeralToRomanNumeral(number);
        });
    }
}
