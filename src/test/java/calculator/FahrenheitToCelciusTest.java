package test.java.calculator;

import org.junit.Assert;
import main.java.calculator.Calculator;

class FahrenheitToCelciusTest {

    @org.junit.jupiter.api.Test
    void mustGiveCorrectCelciusFromFahrenheit() {
        // Arrange
        double fahrenheit = 90.0;
        double expected = 32.2;
        // Act
        double result = Calculator.fahrenheitToCelcius(fahrenheit);
        // Assert
        Assert.assertEquals(expected, result, 0.000005);
    }
}