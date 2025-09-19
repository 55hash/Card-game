/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Name: Hashandeep Singh

package card;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @Hashandeep Singh - 991787094
 */


 public class CardTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Card luckyCard = new Card(7, "Hearts"); 
        System.out.println("Lucky card is: " + luckyCard);

  
        System.out.print("Enter a card value (1–13): ");
        int userValue = sc.nextInt();
        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = sc.nextInt();
        String userSuit = Card.getSuitName(suitIndex);
        

        Card userCard = new Card(userValue, userSuit);

  
        if (userCard.getValue() == luckyCard.getValue() && userCard.getSuit().equals(luckyCard.getSuit())) {
            System.out.println("Congratulations, You got the lucky card");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}


