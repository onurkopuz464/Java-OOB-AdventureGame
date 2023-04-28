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
        player_Type.put(0, new Character(Character.Samurai.getMob_id(),Character.Samurai.getHealth(),Character.Samurai.Samurai.getShield(),Character.Samurai.getGold(),Character.Samurai.getDamage()));
        player_Type.put(1, new Character(Character.Archer.getMob_id(),Character.Archer.getHealth(),Character.Archer.getShield(),Character.Archer.getGold(),Character.Archer.getDamage()));
        player_Type.put(2, new Character(Character.Paladin.getMob_id(),Character.Paladin.getHealth(),Character.Paladin.getShield(),Character.Paladin.getGold(),Character.Paladin.getDamage()));

        player = player_Type.get(Utility.scan.scan());
        player_Main_Hp = player.getHealth();
        player_main_Shield = player.getShield();
        player_main_Damage= player.getDamage();
        get_Maps.base_map.Map_func();
    }

}
