package Actions;

import Entities.Entity;
import orientation.Main_Menu;
import orientation.get_Action;
import orientation.get_Inventor;
import orientation.get_Player;

public class damage_taken {
    public void Enemy_Action(Entity e) {
        damage(e.getDamage(), e.getName());
    }


    void damage(int get_damage, String Name) {
        int damage = get_damage+get_Action.buffDamage.Crit_(get_damage);
        get_Inventor.use_Item.item_live();
        if (get_Player.getCharacter.player.getShield() < 1 && get_Player.getCharacter.player.getHealth() > damage) {
            get_Player.getCharacter.player.setHealth(get_Player.getCharacter.player.getHealth() - damage);
            System.out.println(Name + " tarafından " + damage + " Hasar aldınız.");

            if (get_Player.getCharacter.player.getHealth() < 1) {
                System.out.println("-------------------------------------------------");
                System.out.println("öldün");
                Main_Menu.main();
            } else {
               // System.out.println("Kalan canınız : " + get_Player.getCharacter.player.getHealth());
            }
        } else if (get_Inventor.use_Item.using_Item.containsKey(0)&&get_Inventor.use_Item.using_Item.get(0).getShield() > damage) {
            get_Inventor.use_Item.using_Item.get(0).setShield(get_Inventor.use_Item.using_Item.get(0).getShield() - damage);
           // System.out.println(Name + " tarafından " + damage + " Zırhınıza Hasar aldınız.");
            get_Inventor.use_Item.item_live();
           // System.out.println("Kalan zırhınız : " + get_Inventor.use_Item.using_Item.get(0).getShield());
            System.out.println("-------------------------------------------------");

        } else {

            if (get_Player.getCharacter.player.getHealth() + get_Player.getCharacter.player.getShield() > damage) {
                get_Player.getCharacter.player.setHealth(get_Player.getCharacter.player.getHealth() - (damage - get_Inventor.use_Item.using_Item.get(0).getShield()));
                get_Inventor.use_Item.item_live();
                System.out.println(Name + " tarafından " + damage + " Hasar aldınız.");
                get_Inventor.inventory.my_items.remove(get_Inventor.use_Item.using_Item.get(0));
                System.out.println("Zırhınız kırıldı");
                get_Inventor.use_Item.using_Item.get(0).setShield(0);
                get_Inventor.use_Item.item_live();
                System.out.println("-------------------------------------------------");

            } else {
                System.out.println("-------------------------------------------------");
                System.out.println(Name + " tarafından " + damage + " Hasar aldınız.");
                System.out.println("öldün");
                Main_Menu.main();
            }

        }
    }


}
