package Actions;

import orientation.get_Player;

import java.util.Random;

public class Enemies_Drop_Item {
    public int take_gold_drop(int gold){
        Random r = new Random();
        int get_gold = r.nextInt(gold)+1;
        get_Player.getCharacter.player.setGold(get_Player.getCharacter.player.getGold()+ get_gold);
        return get_gold;
    }
}
