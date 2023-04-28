package Map_Combat;

import Entities.Entity;
import orientation.get_Action;

import java.util.Stack;

public class Combat_Action {
    public static void Player_Send_Atack(Stack id) {
        get_Action.atack.damage((Entity) id.pop());
    }
    public static void Enemy_Send_Atack(Stack id){
        while(!id.isEmpty())
        {
            get_Action.damageTaken.Enemy_Action((Entity) id.pop());
        }

    }
}
