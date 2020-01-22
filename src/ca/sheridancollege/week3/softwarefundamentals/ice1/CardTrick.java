/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author
 */
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        Card[] magicHand = new Card[7];
        
        // Hard-coded luckyCard
        //  Card[] luckyCard = "Hearts diamonds";
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13));
            // c.setSuit(int(Card.SUITS((Math.random() * 4)));
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the card number");
        int n = sc.nextInt();
        System.out.println("Enter the suit number");
        int s = sc.nextInt();
        
        // and search magicHand here
        for (int q=0;q<magicHand.length;q++)
        {
            //    if (magicHand[] == n && s)
            
            
            
        }
        //Then report the result here
        System.out.println("Win");
        
        System.out.println("Displayed Suit and value of luckyCard");
        
    }
    
}
