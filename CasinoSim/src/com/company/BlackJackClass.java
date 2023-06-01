package com.company;
import java.util.Random;

public class BlackJackClass {

    private int Card_Number;
    private int DealtHand;
    private int DealtCard;

    public BlackJackClass(int Number){
        Card_Number = Number;
        hit();
    }

    public void hit(){
        Random rand = new Random();
        DealtHand = rand.nextInt(Card_Number);
    }


    public void NextCard(){
        Random rand = new Random();
        DealtCard = rand.nextInt(10) + 1;
    }

    public int getHand(){
        return DealtHand;
    }

    public int getNextCard(){return DealtCard;}
}
