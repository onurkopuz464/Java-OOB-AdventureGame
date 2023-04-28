package orientation;

public class Main_Menu {

    public static void main()
    {
        System.out.println("Ana Ekrana Hoşgeldiniz");
        System.out.println("Başlamak için 0 a basın.");
        System.out.println("Kapatmak için 1 a basın.");
        if(Utility.scan.scan() == 0)
            get_Player.getCharacter.Select_Character_Type();
        else
            System.out.println("Güle Güle");

    }
}
