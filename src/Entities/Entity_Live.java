package Entities;

import Entities.Entity;
import orientation.get_Enemy;

import java.util.*;

public class Entity_Live {
    public static ArrayList<Entity> live_mobs = new ArrayList<Entity>();
    static Stack<Entity> combat_Queue = new Stack<Entity>();
    public void random_spawner(int id) {
        Random r = new Random();
       // int count = r.nextInt(3) + 1;
      int count = 3;


        Map<Integer, Entity> mobs = new HashMap<>();

        mobs.put(0, new Entity(0, 12, 0, 4, 3,"Zombi"));
        mobs.put(1, new Entity(1, 16, 0, 7, 4,"İskelet"));
        mobs.put(2, new Entity(2, 19, 0, 12, 5,"Ogre"));

        if (mobs.containsKey(id)) {
            for (int i = 0; i < count; i++) {
                Entity new_mob = new Entity(mobs.get(id).getMob_id(),mobs.get(id).getHealth(),mobs.get(id).getShield(),mobs.get(id).getGold(),mobs.get(id).getDamage(),mobs.get(id).getName());
                live_mobs.add(new_mob);
            }
            System.out.println(count + " Adet " + mobs.get(id).getName() + " Doğdu");
        }
        System.out.println("-------------------------------------------------");
    }
    public Stack imLive_()
    {

        combat_Queue.clear();
        for (int i = 0; i < get_Enemy.entityLive.live_mobs.size(); i++) {//.getMob_id()
            combat_Queue.push(get_Enemy.entityLive.live_mobs.get(i));
        }
        return combat_Queue;
    }
    public Stack Player_Atack_This_Enemy()
    {
        combat_Queue.clear();
        combat_Queue.push(get_Enemy.entityLive.live_mobs.get(0));
        return combat_Queue;
    }

}
