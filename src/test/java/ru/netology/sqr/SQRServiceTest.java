package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void squaresInRange() {
        SQRService service = new SQRService();

        int range1 = 200;
        int range2 = 300;
        long expected = 3;

        long actual = service.squaresInRange(range1, range2);

        assertEquals(expected, actual);
    }

    @Test
    void squaresLowRangeTestL() {
        SQRService service = new SQRService();

        int range1 = 99;
        int range2 = 100_000_000;
        long expected = 90;

        long actual = service.squaresInRange(range1, range2);

        assertEquals(expected, actual);
    }

    @Test
    void squaresLowRangeTestM() {
        SQRService service = new SQRService();

        int range1 = 100;
        int range2 = 100_000_000;
        long expected = 90;

        long actual = service.squaresInRange(range1, range2);

        assertEquals(expected, actual);
    }

    @Test
    void squaresLowRangeTestH() {
        SQRService service = new SQRService();

        int range1 = 101;
        int range2 = 100_000_000;
        long expected = 89;

        long actual = service.squaresInRange(range1, range2);

        assertEquals(expected, actual);
    }

    @Test
    void squaresHighRangeTestL() {
        SQRService service = new SQRService();

        int range1 = 100;
        int range2 = 9800;
        long expected = 89;

        long actual = service.squaresInRange(range1, range2);

        assertEquals(expected, actual);
    }

    @Test
    void squaresHighRangeTestN() {
        SQRService service = new SQRService();

        int range1 = 100;
        int range2 = 9801;
        long expected = 90;

        long actual = service.squaresInRange(range1, range2);

        assertEquals(expected, actual);
    }

    @Test
    void squaresHighRangeTestH() {
        SQRService service = new SQRService();

        int range1 = 100;
        int range2 = 9802;
        long expected = 90;

        long actual = service.squaresInRange(range1, range2);

        assertEquals(expected, actual);
    }
}