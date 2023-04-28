package Maps;

import Entities.Entity;
import orientation.get_Enemy;

public class Forest_Map {
    public void Map_Spawn()
    {
        get_Enemy.entityLive.live_mobs.clear();
        get_Enemy.entityLive.random_spawner(Entity.Ogre.getMob_id());
    }
}
