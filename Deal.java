import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deal {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("(Ace)");
        String[] newPack;
        HashMap <String, Integer> value;
        ArrayList <Player> winners = new ArrayList <Player>();
        CardPack cardPack = new CardPack();
        CardsShuffle cardsShuffle = new CardsShuffle();
        Random random = new Random();
        newPack = cardsShuffle.shuffledPack();
        value = cardPack.getPack();
        int playerCount = random.nextInt(10);
        int cardIndex = 0;
        for (int i = 0; i <= playerCount; i++) {
            Player player = new Player();
            do {
                player.setCurrentScore(value.get(newPack[cardIndex]));
                player.setCurrentCards(newPack[cardIndex]);
                Matcher m = p.matcher(newPack[cardIndex].toString());
                if (m.find()) {
                    player.aceCout++;
                }
                if (player.getCurrentScore() > 21 && player.aceCout > 0) {
                    player.setCurrentScore(-10);
                    player.aceCout--;
                }
                cardIndex++;
            } while (player.getCurrentScore() < 16);
            if (player.getCurrentScore() <= 21) {
                winners.add(player);
            }
        }
        ArrayList<Player> absoulteWinners = Deal.getWinners(winners);
        if(absoulteWinners.size()> 1){
            System.out.println("Game result is draw");
        }else{
            System.out.println("Absolute winner is :" + absoulteWinners.get(0) + " with score " + absoulteWinners.get(0).getCurrentScore());
        }
    }

    public static ArrayList<Player> getWinners(ArrayList<Player> winners){
        Player winner = new Player();
        System.out.println("Winners list :");
        ArrayList<Player> winnerPlayers = new ArrayList <Player>();
        for (Player pla : winners) {
            System.out.println(pla + " with current score : " + pla.getCurrentScore());
            if (winner.getCurrentScore() < pla.getCurrentScore()) {
                winner = pla;
            }
        }
        for (Player pla : winners) {
            if (pla.getCurrentScore() == winner.getCurrentScore())
                winnerPlayers.add(pla);
        }
        return winnerPlayers;
    }
}
