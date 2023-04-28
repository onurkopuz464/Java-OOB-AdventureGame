package Items;

import capsule_Item.Item_Info;

import java.util.HashMap;

import orientation.get_Player;

public class Use_Item {

    public static HashMap<Integer,Item_Info>  using_Item = new HashMap<Integer,Item_Info>();

    public void useItem(Item_Info item) {

        if(item.getItem_type() ==0){
            using_Item.put(0,item);
        }
        else if(item.getItem_type() ==1)
        {
            using_Item.put(1,item);
        }
        item_live();
    }

    public void success_item_use(){
        if(!using_Item.isEmpty())
        {

                if(using_Item.containsKey(0)) {

                        get_Player.getCharacter.player
                                .setShield(get_Player.getCharacter.player_main_Shield + using_Item.get(0).getShield());


                }
                if(using_Item.containsKey(1)) {
                    get_Player.getCharacter.player
                            .setDamage(get_Player.getCharacter.player_main_Damage + using_Item.get(1).getDamage());
                }
        }

    }
    public void item_live(){
        success_item_use();
    }


}
