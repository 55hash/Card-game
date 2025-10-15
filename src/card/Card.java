/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this licensess
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Name: Hashandeep singh

package card;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author srinivsi
 * @author Hashandeep Singh - 991787094
 */



public class Card {

   private String suit; 
   private int value;

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
   
   
   /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    public static String getSuitName(int index) {
        if (index > 0 && index < SUITS.length){
            return SUITS[index];
        } else {
            return "Unknown";
        }
    }
    
    @Override
    public String toString() {
        return suit + " " + value;
    }
    
   
   
    
}
