package com.zemoso.labs.utils;

public class ChristmasLightsUtil {

    public static void printCornerLights(int [][] array) {
        System.out.println("left top corner: " + array[0][0]);
        System.out.println("right top corner: " + array[0][999]);
        System.out.println("left bottom corner: " + array[999][0]);
        System.out.println("right bottom corner: " + array[999][999]);
    }


}
