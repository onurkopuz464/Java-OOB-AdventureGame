package Entities;

import Entities.Character;
import orientation.Utility;
import orientation.get_Maps;
import orientation.get_Player;

import java.util.HashMap;
import java.util.Map;

public class get_Character {
    public Character player;
    public int player_main_Shield;
    public int player_main_Damage;
    public int player_Main_Hp;


    public void Select_Character_Type() {
        System.out.println("-------------------------------------------------");
        System.out.println("Lütfen Karakterinizi seçmek için numarasını seçin : ");
        System.out.println("0-Samurai");
        System.out.println("1-Archer");
        System.out.println("2-Paladin");

        Map<Integer, Character> player_Type = new HashMap<>();
        player_Type.put(0, new Character(0, 35, 0, 0, 7));
        player_Type.put(1, new Character(1, 30, 0, 0, 9));
        player_Type.put(2, new Character(2, 45, 0, 0, 6));

        player = player_Type.get(Utility.scan.scan());
        player_Main_Hp = player.getHealth();
        player_main_Shield = player.getShield();
        player_main_Damage= player.getDamage();
        get_Maps.base_map.Map_func();
    }

}
