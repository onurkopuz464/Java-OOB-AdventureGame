package Maps;

import orientation.Utility;
import orientation.get_Inventor;
import orientation.get_Item;
import orientation.get_Player;


public class Base_Map {

    public void Map_func() {

        get_Player.getCharacter.player.setHealth(get_Player.getCharacter.player_Main_Hp);
        System.out.println("Güvenli Alan etkisi : Canınız tazelendi");
        System.out.println("Harita Seçim Ekranına Geçmek için 0 a basın");
        System.out.println("Eşya Satın Almak İçin 1 e basın");
        System.out.println("Envateri görüntülemek için 2 ye basın");
        System.out.println("Durum Penceresini Görmek için 3 ye basın");
        System.out.println("-------------------------------------------------");
        switch (Utility.scan.scan()) {
            case 0:
                get_Player.selectMap.map();
                break;
            case 1:
                System.out.println("Zırhlar için 0 Silahlar için 1 e basın");
                if (Utility.scan.scan() == 0)
                    //get_Item.buyItem.Select_List(0);
                    get_Item.buyItem.Select_List(0);

                else
                    //get_Item.buyItem.Select_List(1);
                    get_Item.buyItem.Select_List(1);
                break;
            case 2:

                //get_Inventor.invetory.list_filter_inventory();
                get_Inventor.inventory.list_filter_inventory();
                break;
            default:
                get_Player.playerStatus.stats();
                break;

        }


    }

}
