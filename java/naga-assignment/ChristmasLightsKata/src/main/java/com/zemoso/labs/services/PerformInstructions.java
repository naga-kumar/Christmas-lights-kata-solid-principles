package com.zemoso.labs.services;

public interface PerformInstructions {
    int[][] performInstruction(int [][] lights, int firstRow, int firstColumn, int lastRow, int lastColumn, String instruction);
}
