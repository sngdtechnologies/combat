
import com.streetfighter.combat.Arena;
import com.streetfighter.combat.Robot;

public class combat {

    public static void main(String[] args) {
        // TODO code application logic here
        Robot rob1 = new Robot("Robot 1", 10);
        Robot rob2 = new Robot("Robot 2", 10);
        
        System.out.println("Robot 1 Nom : " + rob1.getNomRobot()+ " np : " + rob1.getNombrePointDeVie());
        System.out.println("Robot 2 Nom : " + rob2.getNomRobot()+ " np : " + rob2.getNombrePointDeVie());
        
        Arena combat = new Arena(rob1, rob2);
        combat.fight();
    }
    
}
