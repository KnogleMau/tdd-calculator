package dk.Knoglemau;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator instance = new Calculator();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Calculator regne stykke test")
    void test1() {
        int expected = 8;
        int actual = instance.add(4,4);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Calculator regne stykke test")
    void test2() {
        int expected = 4;
        int actual = instance.subtract(8,4);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Calculator regne stykke test")
    void test3() {
        int expected = 16;
        int actual = instance.multiply(4,4);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Calculator regne stykke test")
    void test4() {
        int expected = 1;
        int actual = instance.divide(4,4);
        assertEquals(expected, actual);
    }

}