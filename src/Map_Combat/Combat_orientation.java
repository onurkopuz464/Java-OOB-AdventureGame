package Map_Combat;

import orientation.get_Inventor;
import orientation.get_Player;
import orientation.Utility;
import orientation.get_Enemy;
import orientation.get_Maps;

public class Combat_orientation {
    static boolean Success_Stage = true;


    public void live_Action() {
        while (true) {
            get_Inventor.use_Item.item_live();
            player_Round();
            if (!Complate_Map()) {
                enemy_Round();
                if (get_Player.getCharacter.player.getHealth() < 1) break; //Ölüm fonksiyonu
                else {
                    System.out.println("----------------Yeni Tur------------------");
                    System.out.println("Karakterinizin Canı :" + get_Player.getCharacter.player.getHealth() + " Karakterinizin Zırhı :" + get_Player.getCharacter.player.getShield());
                    System.out.println("Devam Etmek için 0 a basın.");
                    System.out.println("Kaçmak İçin 1 e basın");
                    if (Utility.scan.scan() != 0) {

                        break;
                    }
                }
            } else
                break;
        }
        get_Enemy.entityLive.live_mobs.clear();
        get_Maps.base_map.Map_func();


    }

    private void player_Round() {

        Combat_Action.Player_Send_Atack(get_Enemy.entityLive.Player_Atack_This_Enemy());

    }

    private void enemy_Round() {
        Combat_Action.Enemy_Send_Atack(get_Enemy.entityLive.imLive_());

    }


    boolean Complate_Map() {
        if (get_Enemy.entityLive.live_mobs.isEmpty()) {
            System.out.println("Aşama tamamlandı. Güvenli Alana Gidiyorsunuz...");
            return true;
        } else
            return false;
    }


}
