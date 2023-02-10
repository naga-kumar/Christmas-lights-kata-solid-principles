package com.zemoso.labs.services;

import com.zemoso.labs.constants.*;

public class PerformInstructionsService implements PerformInstructions {

    public int[][] performInstruction(int [][] lights, int firstRow, int firstColumn, int lastRow, int lastColumn, String instruction) {
        for (int i = firstRow; i <= lastRow; i++) {
            for (int j = firstColumn; j <= lastColumn; j++) {
                switch(instruction) {
                    case ChristmasConstants.TURN_OFF:
                        lights[i][j] = lights[i][j] - 1;
                        break;
                    case ChristmasConstants.TURN_ON:
                        lights[i][j] = lights[i][j] + 1;
                        break;
                    case ChristmasConstants.TOGGLE:
                        lights[i][j] = lights[i][j] + 2;
                        break;
                    default:
                        System.out.println("There is no valid instruction given");
                }
            }
        }
        return lights;
    }

}
