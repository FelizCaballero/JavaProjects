package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        //Get the players name.
        String name = JOptionPane.showInputDialog("Enter your name.");

        //Display personalized greeting for the player.
        JOptionPane.showMessageDialog(null, "Welcome to CasinoSim " + name);

        //Get the players initial deposit.
        String inputDeposit = JOptionPane.showInputDialog("Please enter your initial deposit.");

        //Convert the inputted string into an integer.
        int initialDeposit = Integer.parseInt(inputDeposit);

        int TotalWinnings = 0, TotalLosses = 0, TotalBalance = 0;

        MoneyClass StartingBalance = new MoneyClass(initialDeposit);

        if (initialDeposit < 20)
            JOptionPane.showMessageDialog(null, "Your deposit is below the minimum " + 20);
        else if (initialDeposit > 1000)
            JOptionPane.showMessageDialog(null, "Your deposit is above the maximum " + 1000);
        else
            JOptionPane.showMessageDialog(null, "Thank you for your deposit of, " + initialDeposit + " please enjoy the CasinoSim Mr. " + name);

        String GameInput = JOptionPane.showInputDialog("Which game would you like to play? 1-SlotMachine or 2-BlackJack?");

        int game = Integer.parseInt(GameInput);

        String PlayAgain;
        do {

            switch (game) {
                case 1:
                    int slot1_number = 9, slot2_number = 9, slot3_number = 9;

                    SlotMachineClass slot1 = new SlotMachineClass(slot1_number);
                    SlotMachineClass slot2 = new SlotMachineClass(slot2_number);
                    SlotMachineClass slot3 = new SlotMachineClass(slot3_number);

                    String repeat;
                    do {
                        slot1.pull();
                        slot2.pull();
                        slot3.pull();

                        if ((slot1.getResults() == slot2.getResults()) && (slot1.getResults() == slot3.getResults())){
                            StartingBalance.accrual();
                            TotalWinnings += StartingBalance.accrual();
                            JOptionPane.showMessageDialog(null, "Jackpot!!! " + slot1.getResults() + slot2.getResults() + slot1.getResults());
                        }

                        else{
                            StartingBalance.deduction();
                            TotalLosses += StartingBalance.deduction();
                            JOptionPane.showMessageDialog(null, "No match, please try again " + slot1.getResults() + slot2.getResults() + slot3.getResults());
                        }

                        repeat = JOptionPane.showInputDialog("Do you want to go again? Enter 'y' continue or 'n' to quit.");
                        repeat = String.valueOf(repeat.charAt(0));
                    } while (repeat.equals("y"));
                    break;
                case 2:
                    int PlayerCard1 = 10, PlayerCard2 = 10, DealerCard1 = 10, DealerCard2 = 10, PlayerHand, DealerHand, NextCard = 10;

                    BlackJackClass PCard1 = new BlackJackClass(PlayerCard1);
                    BlackJackClass PCard2 = new BlackJackClass(PlayerCard2);
                    BlackJackClass DCard1 = new BlackJackClass(DealerCard1);
                    BlackJackClass DCard2 = new BlackJackClass(DealerCard2);
                    BlackJackClass NC = new BlackJackClass(NextCard);

                    String deal;
                    do {
                        PCard1.hit();
                        PCard2.hit();
                        DCard1.hit();
                        DCard2.hit();

                        DealerHand = DCard1.getHand() + DCard2.getHand();
                        PlayerHand = PCard1.getHand() + PCard2.getHand();

                        String hit = JOptionPane.showInputDialog("Dealers first card is: " + DCard1.getHand() + " Players cards are: " + PCard1.getHand() + " and " + PCard2.getHand() + " Player has: " + PlayerHand + " Will you hit 'h' or stay 's'?");

                        while (hit.equals("h")) {
                            hit = String.valueOf(hit.charAt(0));
                            NC.NextCard();
                            PlayerHand += NC.getNextCard();

                            JOptionPane.showMessageDialog(null, "Next card is: " + NC.getNextCard() + " Player now score: " + PlayerHand);

                            if (PlayerHand > 21) {
                                StartingBalance.deduction();
                                TotalLosses += StartingBalance.deduction();
                                JOptionPane.showMessageDialog(null, "You busted, Dealer wins");
                            } else if (PlayerHand < 21) {
                                hit = JOptionPane.showInputDialog("Player score: " + PlayerHand + " Will you hit 'h' or stay 's'?");
                            } else {
                                StartingBalance.accrual();
                                TotalWinnings += StartingBalance.accrual();
                                JOptionPane.showMessageDialog(null, "BlackJack, player score: " + PlayerHand);
                            }

                            break;
                        }

                        while (hit.equals("s")) {
                            if (DealerHand < PlayerHand && PlayerHand < 21) {
                                StartingBalance.accrual();
                                TotalWinnings += StartingBalance.accrual();
                                JOptionPane.showMessageDialog(null, "Dealer score: " + DealerHand + " player score: " + PlayerHand + " Player wins");
                            } else if (DealerHand > PlayerHand && DealerHand < 21) {
                                StartingBalance.deduction();
                                TotalLosses += StartingBalance.deduction();
                                JOptionPane.showMessageDialog(null, "Dealer score: " + DealerHand + " player score: " + PlayerHand + " Dealer wins");
                            } else {
                                JOptionPane.showMessageDialog(null, "Dealer score: " + DealerHand + " player score: " + PlayerHand + " Tie, no winner");
                            }
                            break;
                        }

                        deal = JOptionPane.showInputDialog("Do you want to deal again? Enter 'y' continue or 'n' to quit.");
                        deal = String.valueOf(deal.charAt(0));
                    } while (deal.equals("y"));
                default:
                    JOptionPane.showMessageDialog(null, "Error: Invalid selection");
            }
            PlayAgain = JOptionPane.showInputDialog("Do you want to play a new game or quit? Enter 'y' continue or 'n' to quit.");
            PlayAgain = String.valueOf(PlayAgain.charAt(0));
        } while (PlayAgain.equals("y"));

        TotalBalance = (initialDeposit - TotalLosses) + TotalWinnings;
        JOptionPane.showMessageDialog(null, "Thank you for playing at CasinoSim Mr. " + name + " your total deposit was " + initialDeposit + " you have a total winnings of: " + TotalWinnings + " you have a total losses of: " + TotalLosses + " and you account balance is: " + TotalBalance);
        System.exit(0);
    }
}
