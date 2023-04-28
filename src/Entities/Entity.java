package Entities;

import capsule_Entity.Mob_Info;


public class Entity extends Mob_Info {


    public static Entity Zombie = new Entity(0, 10, 0, 4, 4,"Zombi");
    public static Entity Skeletion = new Entity(1, 14, 0, 7, 5,"İskelet");
    public static Entity Ogre = new Entity(2, 17, 0, 12, 7,"Ogre");

    public static Entity Boss_Zombie =new Entity(3, 25, 0, 30, 7,"Zombi Kralı");
    public static Entity Boss_Skeletion =new Entity(3, 33, 0, 60, 8,"İskelet Kralı");
    public static Entity Boss_Ogre =new Entity(3, 40, 0, 90, 9,"Ogre Kralı");

    private String Name;
    public Entity(int mob_id,int Health, int Shield,int Gold,int Damage,String Name){
        super(mob_id,Health,Shield,Gold,Damage);
        this.Name=Name;

    }

    public String getName() {
        return Name;
    }
}
