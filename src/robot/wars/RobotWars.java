package robot.wars;

/**
 *
 * @author Tim Harshman
 */
public class RobotWars {


    public static void main(String[] args) {
        
        Robot goteamtim = new Robot("MogDroid");
        Robot monaLisa = new Robot("Mona Lisa");
        String[] che = new String[2];
        che[0] = "";
        
        goteamtim.setWeapon();
        goteamtim.attack(monaLisa);
        goteamtim.displayStats();
        monaLisa.displayStats();
        monaLisa.attack(goteamtim);
        monaLisa.attack(goteamtim);
        goteamtim.displayStats();
        monaLisa.displayStats();
        
        
        
    }
}
