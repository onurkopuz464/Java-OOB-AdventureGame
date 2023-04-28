package Actions;

import java.util.Random;

public class buff_Damage {
    public int Crit_(int damage) {
        double criticalProbability = 0.15;
        double criticalMultiplier = 0.3;
        int ret_Damage = 0;

        if(Math.random() <= criticalProbability) {
            ret_Damage = (int) (damage*criticalMultiplier);
            System.out.println("Kritik Hasar!");
        }
        return ret_Damage;
    }

}
