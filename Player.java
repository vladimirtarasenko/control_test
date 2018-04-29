import java.util.ArrayList;
import java.util.Scanner;

public class Player {

   private int currentScore;
   private String name;
   public int aceCout = 0;
   private ArrayList<String> currentCards =new ArrayList <String>();

    public ArrayList <String> getCurrentCards() {
        return currentCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "currentCards=" + currentCards +
                '}';
    }

    public void setCurrentCards(String currentCards) {
        this.currentCards.add(currentCards);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore2) {
        this.currentScore += currentScore2;
    }

    int players = 0;
    Scanner sc = new Scanner(System.in);

    public int getPlayers() {
        for (; ; ) {
            System.out.println("Please enter the players quantity (up to 10): ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (players > 0 && players <= 10) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("Game finished.");
                        break;
                    } else if (players < 0) {
                        System.out.println("Players quantity cannot be less then 0 !!!");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("Looks like it's not a number!");
                sc.nextLine();
            }
        }

        return players;
    }
}