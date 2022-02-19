package ru.netology.sqr;

public class SQRService {
    public int squaresInRange(int range1, int range2) {
        int k = 0;
        for (int i = 10; i <= 99; i++)
            if (Math.pow(i, 2) >= range1 && Math.pow(i, 2) <= range2)
                k = k + 1;

        return k;
    }
}
