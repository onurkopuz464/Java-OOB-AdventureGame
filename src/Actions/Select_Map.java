package Actions;
import orientation.Utility;
import orientation.get_Maps;
import orientation.get_Player;

public class Select_Map {

    public void map()
    {
        System.out.println("Lütfen Haritayı Seçin");
        System.out.println("0 - Base");
        System.out.println("1 - Mağara");
        System.out.println("2 - Dağ");
        System.out.println("3 - Orman");
        select_map(Utility.scan.scan());
    }
    private void select_map(int id) {
        switch (id) {
            case 1:
                System.out.println("Mağaraya giriş yaptınız.");
                get_Maps.cave_map.Map_Spawn();
                get_Player.combatOrientation.live_Action();
                System.out.println("-------------------------------------------------");
                break;
            case 2:
                System.out.println("Dağa giriş yaptınız.");
                get_Maps.mountian_map.Map_Spawn();
                get_Player.combatOrientation.live_Action();
                System.out.println("-------------------------------------------------");
                break;
            case 3:
                System.out.println("Ormana giriş yaptınız.");
                get_Maps.forest_map.Map_Spawn();
                get_Player.combatOrientation.live_Action();
                System.out.println("-------------------------------------------------");
                break;
            default:
                System.out.println("-------------------------------------------------");
                System.out.println("Güvenli alana giriş yaptınız.");
                get_Maps.base_map.Map_func();



                break;

        }

    }
}
