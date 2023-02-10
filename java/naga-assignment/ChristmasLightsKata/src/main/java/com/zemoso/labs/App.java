package com.zemoso.labs;

import com.zemoso.labs.services.*;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        CreateChristmasLightsService christmasLights = new CreateChristmasLightsService(1000, 1000);
        int [][] array = christmasLights.createChristmasLights();

        CalculateCoordinatePairService coordinatePairService = new CalculateCoordinatePairService();
        int count = coordinatePairService.calculateCoordinatePair(array, 0, 0, 2, 2);
        System.out.println(count);

        PerformInstructionsService lightsService = new PerformInstructionsService();

        //instructions from kata - https://kata-log.rocks/christmas-lights-kata
        System.out.println("array before: " + array[887][9]);
        array = lightsService.performInstruction(array, 887, 9, 959, 629, "turnOn");
        System.out.println("array after: " + array[887][9]);

        System.out.println("array before: " + array[453][398]);
        array = lightsService.performInstruction(array, 453, 398, 844, 448, "turnOn");
        System.out.println("array after: " + array[453][398]);

        System.out.println("array before: " + array[539][243]);
        array = lightsService.performInstruction(array, 539, 243, 559, 965, "turnOff");
        System.out.println("array after: " + array[453][398]);


        //recreate array
        array = christmasLights.createChristmasLights();

        //examples from kata - https://kata-log.rocks/christmas-lights-kata
        System.out.println("array before: " + array[0][0]);
        array = lightsService.performInstruction(array, 0, 0, 0, 0, "turnOn");
        System.out.println("array after: " + array[0][0]);

        System.out.println("array before: " + array[0][0]);
        array = lightsService.performInstruction(array, 0, 0, 0, 0, "turnOff");
        System.out.println("array after: " + array[0][0]);

        System.out.println("array before: " + array[0][0]);
        array = lightsService.performInstruction(array, 0, 0, 999, 999, "toggle");
        System.out.println("array after: " + array[0][0]);

    }
}
