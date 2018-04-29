import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsShuffle {


        CardPack pack = new CardPack();
        Map<String,Integer> newPack = new HashMap<String, Integer>();

        String[] suits = {"hearts", "diamonds", "spades", "clubs"};

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Dame", "King", "Ace" };

        int n = suits.length * rank.length;



        String[] deck = new String[n];

        public String[] shuffledPack() {
            newPack =pack.getPack();
            for (int i = 0; i < rank.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    deck[suits.length * i + j] = rank[i] + " " + suits[j];
                }
            }

            // часть 4 - перетасовка колоды
            for (int i = 0; i < n; i++) {
                int r = i + (int) ( Math.random() * ( n - i ) ); // случайная карта в колоде
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }

            return  deck ;
        }

        // часть 5 - перетасованная колода выводится на экран
       // for (int i = 0; i < n; i++) {
          //  System.out.println(deck[i] +newPack.get(deck[i]));
          //  //if (i % cardsPerPlayer == cardsPerPlayer - 1)
            //    System.out.println();
        }





