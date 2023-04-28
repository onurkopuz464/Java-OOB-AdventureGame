package Items;

public class Armor {


    private int Price;
    private int Shield;
    private int item_id;
    private String name;

    public Armor(int item_id,String name ,int price, int shield) {
        this.item_id=item_id;
        this.name=name;
        Price = price;
        Shield = shield;

    }


    public int getShield() {
        return Shield;
    }

    public int getItem_id(){
        return this.item_id;
    }

    public int getPrice() {
        return Price;
    }

    public String getName() {
        return name;
    }

    public void setShield(int shield) {
        Shield = shield;
    }
}

