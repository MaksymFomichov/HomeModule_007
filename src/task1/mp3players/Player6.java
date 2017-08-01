package task1.mp3players;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player6 extends Player3 {

    public Player6(int price) {
        super(price);
    }

    // перемешивает все песни в плейлисте местами
    public void shuffle(){
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(songs));
        Collections.shuffle(strings);
        int i = 0;
        for (String song : strings) {
            System.out.println(++i + " song: " + song);
        }
    }
}
