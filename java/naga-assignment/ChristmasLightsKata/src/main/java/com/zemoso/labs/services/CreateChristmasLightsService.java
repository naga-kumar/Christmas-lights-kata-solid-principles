package com.zemoso.labs.services;

public class CreateChristmasLightsService implements CreateChristmasLights {

    private final int[][] christmasLights;

    private final int rowSize;

    private final int columnSize;

    public CreateChristmasLightsService(int rowSize, int columnSize) {
        this.christmasLights = new int[rowSize][columnSize];
        this.rowSize = rowSize;
        this.columnSize = columnSize;
    }

    public int[][] createChristmasLights() {
        for (int i = 0; i < rowSize; i++) {
            int value = 0;
            for (int j = 0; j < columnSize; j++) {
                christmasLights[i][j] = value;
                value++;
            }
        }
        return christmasLights;
    }



}
