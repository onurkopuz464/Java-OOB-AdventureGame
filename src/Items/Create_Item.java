package Items;

import capsule_Item.Item_Info;

import java.util.ArrayList;

public class Create_Item {
    public static ArrayList<Item_Info> item_list = new ArrayList<Item_Info>();

    private static Create_Item create_item;
    static {
        create_item = new Create_Item();
        new_Create_Item();
    }

    public  static  void new_Create_Item(){
        //Zırhlar
        Item_Info light_armor = new Item_Info(35,5,0,0,0,"Light Armor");
        Item_Info normal_armor = new Item_Info(45,10,0,1,0,"Normal Armor");
        Item_Info heavy_armor = new Item_Info(60,20,0,2,0,"Heavy Armor");

        //Silahlar
        Item_Info light_weapon = new Item_Info(25,0,3,3,1,"Light Weapon");
        Item_Info normal_weapon = new Item_Info(35,0,6,4,1,"Normal Weapon");
        Item_Info heavy_weapon = new Item_Info(45,0,8,5,1,"Heavy Weapon");

        item_list.add(light_armor);
        item_list.add(normal_armor);
        item_list.add(heavy_armor);

        item_list.add(light_weapon);
        item_list.add(normal_weapon);
        item_list.add(heavy_weapon);
    }
}
