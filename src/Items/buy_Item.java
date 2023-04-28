package Items;

import capsule_Item.Item_Info;
import orientation.*;
//item hasarı düşürülcek 1.mapın slotları 2 katına çıkarılcak
//item fiyatları 2 katına çıkarılcak.
//1 kademe üst item eklenecek.
public class buy_Item {

    public void Select_List(int type) {
        System.out.println("Kalan Altın: " + get_Player.getCharacter.player.getGold());

        for (Item_Info item : get_Item.createItem.item_list) {
            if (item.getItem_type() == type) {
                System.out.println(item.getItem_id() + "- " + item.getName() + "--Hasar: " + item.getDamage() + "--Fiyat: " + item.getPrice());
            }
        }
        System.out.println("9 - Çıkış");
        System.out.println("Almak istediğiniz İtemi seçiniz.");
        int select_ = Utility.scan.scan();
        if(select_==9) {
            get_Maps.base_map.Map_func();
        }
        buy_control(select_);
    }

    private void buy_control(int id) {
        for (Item_Info item : get_Item.createItem.item_list) {
            if (item.getItem_id() == id) {
                if (item.getPrice() > get_Player.getCharacter.player.getGold()) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Yeterli Para Yok");
                    get_Maps.base_map.Map_func();
                    break;
                } else {
                    buy_final_item(item);
                    break;
                }
            }
        }
    }

    private void buy_final_item(Item_Info item) {
        System.out.println(item.getName() + " Adlı Eşya Satın Alındı.");
        get_Player.getCharacter.player.setGold(get_Player.getCharacter.player.getGold() - item.getPrice());
        System.out.println("Kalan Paranız: " + get_Player.getCharacter.player.getGold());
        for( Item_Info new_Item:get_Item.createItem.item_list){
            if(new_Item.getItem_id()==item.getItem_id())
            {
                get_Inventor.inventory.my_items.add(new Item_Info(item.getPrice(), item.getShield(),item.getDamage(),item.getItem_id(),item.getItem_type(), item.getName()));
            }
        }
        System.out.println("-------------------------------------------------");
        get_Maps.base_map.Map_func();
    }


}