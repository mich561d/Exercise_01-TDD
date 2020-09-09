package test.java.calculator;

import org.junit.Assert;
import main.java.calculator.Calculator;

class CelciusToFahrenheitTest {

    @org.junit.jupiter.api.Test
    void mustGiveCorrectFahrenheitFromCelcius() {
        // Arrange
        double celcius = 25.0;
        double expected = 77.0;
        // Act
        double result = Calculator.celciusToFahrenheit(celcius);
        // Assert
        Assert.assertEquals(expected, result, 0.000005);
    }
}