import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class CardTest {



        private Deal game;
        public  ArrayList<Player> players ;
        @Before
        public  void onInit()
        {
        players = new ArrayList <Player>();
        Player player1 = new Player();
        player1.setName("Vlad");
            player1.setCurrentScore(10);
            player1.setCurrentScore(11);
            Player player2 = new Player();
            player2.setName("Andrew");
            player2.setCurrentScore(10);
            player2.setCurrentScore(11);
            players.add(player1);
            players.add(player2);
        }

        @Test
        public void calls() {
            assertEquals(2, Deal.getWinners(players).size());
                    }


}
