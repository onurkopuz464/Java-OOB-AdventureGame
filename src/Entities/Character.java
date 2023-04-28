package Entities;

import capsule_Entity.Mob_Info;


public class Character extends Mob_Info {
    public static Character Samurai = new Character(0, 35, 0, 15, 7);
    public static Character Archer = new Character(1, 30, 0, 20, 8);
    public static Character Paladin = new Character(2, 40, 0, 5, 6);

    public Character(int mob_id,int Health, int Shield,int Gold,int Damage){
        super(mob_id,Health,Shield,Gold,Damage);
    }



}

