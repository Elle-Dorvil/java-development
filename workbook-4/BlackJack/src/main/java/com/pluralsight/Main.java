package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Number of players: ");
//        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
//        ArrayList<String> numberOfPlayers = new ArrayList<>();


        System.out.println("Please enter player name: ");
        String name1 = scanner.nextLine();

        System.out.println("Please enter player name: ");
        String name2 = scanner.nextLine();

        Deck deck = new Deck();
        deck.shuffle();
// Player 1's hand = 2 cards
        Hand name1Hand = new Hand();
        name1Hand.deal(deck.deal());
        name1Hand.deal(deck.deal());

// Player 2's hand = 2 cards
        Hand name2Hand = new Hand();
        name2Hand.deal(deck.deal());
        name2Hand.deal(deck.deal());

        System.out.println(name1 + "'s hand: ");
        name1Hand.print();

        System.out.println();

        System.out.println(name2 + "'s hand: ");
        name2Hand.print();

        // How to calculate who wins
        int name1Score = name1Hand.getValue();
        int name2Score = name2Hand.getValue();

        if(name1Score <= 21 && (name1Score > name2Score || name2Score > 21 )) {
            System.out.println(name1 + " wins! ");
        } else if(name2Score <= 21 && (name2Score > name1Score || name2Score < 21 )) {
            System.out.println(name2 + " wins!" );
        } else {
            System.out.println("Its a tie! ");
        }
        scanner.close();

    }
}