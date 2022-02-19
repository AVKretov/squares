package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'Values from homework', 200 ,300, 3",
            "'Low range value lower', 99 ,1000000, 90",
            "'Low range value normal', 100 ,1000000, 90",
            "'Low range value higher', 101 ,1000000, 89",
            "'High range value lower', 100 ,9800, 89",
            "'High range value normal', 100 ,9801, 90",
            "'High range value higher', 100 ,10000, 90"})
    void squaresInRange(String testName, long range1, long range2, long expected) {
        SQRService service = new SQRService();

        long actual = service.squaresInRange(range1, range2);

        assertEquals(expected, actual);
    }
}