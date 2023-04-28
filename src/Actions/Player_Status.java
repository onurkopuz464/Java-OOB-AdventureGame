package Actions;

import orientation.get_Maps;
import orientation.get_Player;

public class Player_Status {

    public void stats(){
        System.out.println("-------------Durum Penceresi---------------");
        System.out.println("Toplam Can: "+ get_Player.getCharacter.player.getHealth());
        System.out.println("Toplam Zırh: "+ get_Player.getCharacter.player.getShield());
        System.out.println("Toplam Hasar: "+ get_Player.getCharacter.player.getDamage());
        System.out.println("Toplam Altın: "+ get_Player.getCharacter.player.getGold());
        System.out.println("-------------------------------------------------");

        get_Maps.base_map.Map_func();
    }
}
