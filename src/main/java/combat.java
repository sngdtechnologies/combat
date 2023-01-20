
import com.streetfighter.combat.Arena;
import com.streetfighter.combat.Fighter;
import com.streetfighter.combat.Robot;
import java.util.Random;

public class combat {

    public static void main(String[] args) {
        // TODO code application logic here
        int n = new Random().nextInt(2);
        Robot rob = new Robot("Robot", 10);
        Fighter fight = new Fighter("Humain", 10, n);
        
        System.out.println("Robot 1 Nom : " + rob.getNomRobot()+ " np : " + rob.getNombrePointDeVie());
        System.out.println("Robot 2 Nom : " + fight.getNomRobot()+ " np : " + fight.getNombrePointDeVie());
        
        Arena combat = new Arena(rob, fight);
        combat.fight();
    }
    
}
