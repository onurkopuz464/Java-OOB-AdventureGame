package capsule_Entity;

import orientation.Main_Menu;

public class Mob_Info {

    private int Health;
    private int Shield;
    private int Gold;
    private int Damage;
    private int mob_id;


    public Mob_Info(int mob_id ,int Health, int Shield,int Gold,int Damage)
    {
        this.Health=Health;
        this.Shield=Shield;
        this.Gold=Gold;
        this.Damage=Damage;
        this.mob_id=mob_id;

    }

    public int getMob_id() {
        return mob_id;
    }

    public int getHealth()
    {
        return this.Health;
    }
    public void setHealth(int Health)
    {
        this.Health=Health;

    }

    public int getShield() {
        return Shield;
    }

    public void setShield(int shield) {
        this.Shield = shield;
    }

    public int getGold() {
        return Gold;
    }

    public void setGold(int gold) {
        this.Gold = gold;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        this.Damage = damage;
    }
}
