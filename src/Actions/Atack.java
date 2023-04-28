package Actions;

import Entities.Entity;
import orientation.get_Action;
import orientation.get_Enemy;
import orientation.get_Player;

import java.util.Random;

public class Atack {

    public void damage(Entity e) {
        int damage = get_Player.getCharacter.player.getDamage()+ get_Action.buffDamage.Crit_(get_Player.getCharacter.player.getDamage());
        e.setHealth(e.getHealth() - damage);
        System.out.println(e.getName() + " adlı canavar " +damage+ " Hasar aldı");
        System.out.println("Kalan canı :"+e.getHealth());
        if (e.getHealth() < 1) {
            System.out.println(e.getName() + " adlı canavar " + "öldü");
            System.out.println( get_Enemy.dropItem.take_gold_drop(e.getGold())+" Altın Düşürdü.");
            get_Enemy.entityLive.live_mobs.remove(e);
        }
        System.out.println("-------------------------------------------------");

    }
}
