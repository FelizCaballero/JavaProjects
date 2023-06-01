package com.company;

import java.util.Scanner;

public class FreezingandBoilingPointDemo {

    public static void main(String[] args) {

        double temperature;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        temperature = keyboard.nextDouble();



        FreezingandBoilingPoints freezeAndBoilingPoints = new FreezingandBoilingPoints();
        FreezingandBoilingPointClass freezeAndBoiling = freezeAndBoilingPoints.new FreezingandBoilingPointClass(
                temperature);

        if (freezeAndBoiling.isEthylAlchoolBoiling()) {
            System.out.println("Ethyl alcohol will freeze.");
        }

        if (freezeAndBoiling.isOxygenFreezing()) {
            System.out.println("Oxygen will freeze.");
        }

        if (freezeAndBoiling.isWaterFreezing())
            System.out.println("Water will freeze.");

        if (freezeAndBoiling.isEthylAlchoolBoiling()) {
            System.out.println("Ethyl alcohol will boil.");
        }

        if (freezeAndBoiling.isOxygenBoiling()) {
            System.out.println("Oxygen will boil.");
        }

        if (freezeAndBoiling.isWaterBoiling()) {
            System.out.println("Water will boil.");
        }
    }
}
