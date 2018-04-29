import java.util.HashMap;

public class CardPack {

    HashMap <String, Integer> pack = new HashMap <String, Integer>();
    String[] suit = {"hearts", "diamonds", "spades", "clubs"};

    public HashMap <String, Integer> getPack() {
        for (int i = 0; i < 4; i++) {
            pack.put("2" + " " + suit[i], 2);
            pack.put("3" + " " + suit[i], 3);
            pack.put("4" + " " + suit[i], 4);
            pack.put("5" + " " + suit[i], 5);
            pack.put("6" + " " + suit[i], 6);
            pack.put("7" + " " + suit[i], 7);
            pack.put("8" + " " + suit[i], 8);
            pack.put("9" + " " + suit[i], 9);
            pack.put("10" + " " + suit[i], 10);
            pack.put("Jack" + " " + suit[i], 10);
            pack.put("Dame" + " " + suit[i], 10);
            pack.put("King" + " " + suit[i], 10);
            pack.put("Ace" + " " + suit[i], 11);
        }
        return pack;
    }
}
