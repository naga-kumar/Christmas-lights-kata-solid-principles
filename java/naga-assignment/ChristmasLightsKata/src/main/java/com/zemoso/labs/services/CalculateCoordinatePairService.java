package com.zemoso.labs.services;

public class CalculateCoordinatePairService implements CalculateCoordinatePair {

    public int calculateCoordinatePair(int [][] lights, int firstRow, int firstColumn, int lastRow, int lastColumn) {
        int count = 0;
        for (int i = firstRow; i <= lastRow; i++) {
            for (int j = firstColumn; j <= lastColumn; j++) {
                count = count + 1;
            }
        }
        return count;
    }

}
