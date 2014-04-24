package robot.wars;

import java.util.Scanner;

/**
 *
 * @author Tim Harshman
 */
public class RobotWars {


    public static void main(String[] args) {
        String robotName;
        
        System.out.println("Welcome to Robot Wars\n");
        System.out.println("        [ ]");
        System.out.println("       (   )");
        System.out.println("        |>|");
        System.out.println("     __/===\\__");
        System.out.println("    //| o=o |\\\\");
        System.out.println("  <]  | o=o |  [>");
        System.out.println("      \\=====/");
        System.out.println("     / / | \\ \\");
        System.out.println("    <_________>\n");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the name of your robot.");
        robotName = keyboard.next();
        Robot player1 = new Robot(robotName);
        
        
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
