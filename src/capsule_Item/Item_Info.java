package capsule_Item;

import orientation.get_Player;

public class Item_Info {
    private int Price;
    private int Shield;
    private int Damage;
    private int item_id;
    private int item_type;
    private String name;

    public Item_Info(int price, int shield, int damage, int item_id, int item_type, String name) {
        this.Price = price;
        this.Shield = shield;
        this.Damage = damage;
        this.item_id = item_id;
        this.item_type = item_type;
        this.name = name;
    }

    public void setShield(int shield ) {

        Shield = shield;
    }

    public int getPrice() {
        return this.Price;
    }

    public int getShield() {
        return this.Shield;
    }

    public int getDamage() {
        return this.Damage;
    }

    public int getItem_id() {
        return this.item_id;
    }

    public int getItem_type() {
        return this.item_type;
    }

    public String getName() {
        return this.name;
    }
}
