package Items;

import capsule_Item.Item_Info;
import orientation.Utility;
import orientation.get_Inventor;
import orientation.get_Maps;

import java.util.ArrayList;

public class Inventory {
    public static ArrayList<Item_Info> my_items = new ArrayList<Item_Info>();

    public void list_filter_inventory() {
        System.out.println("Görüntülemek için Zırhlar 0 || Silahlar 1 ");
        int type = Utility.scan.scan();
        if (type == 0) {
            System.out.println("Zırhlar");

            for (Item_Info item : Inventory.my_items) {
                if (item.getItem_type() == type) {

                    System.out.println(" +" + item.getName() + " || Kalan Zırh Miktarı: " + item.getShield() + " || Kullanmak için " + my_items.indexOf(item) + " basın");
                }
            }
            System.out.println("-------------------------------------------------");
        } else if (type == 1) {
            System.out.println("Silahlar");
            for (Item_Info item : Inventory.my_items) {
                if (item.getItem_type() == type) {
                    System.out.println(" +" + item.getName() + " || Hasar Miktarı: " + item.getDamage() + " || Kullanmak için " + my_items.indexOf(item) + " basın");
                }

            }
            System.out.println("-------------------------------------------------");
        }

        System.out.println("-99 Çıkış");
        int select_ = Utility.scan.scan();
        if (select_ <= my_items.size())
            get_Inventor.use_Item.useItem(my_items.get(select_));
        get_Maps.base_map.Map_func();

    }


}


