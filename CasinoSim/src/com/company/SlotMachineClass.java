package com.company;
import java.util.Random;

public class SlotMachineClass {

    private int SlotNumber;
    private int results;

    public SlotMachineClass(int Number){
        SlotNumber = Number;
        pull();
    }

    public void pull(){
        Random rand = new Random();
        results = rand.nextInt(SlotNumber);
    }

    public int getResults(){
        return results;
    }
}
