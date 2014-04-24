package robot.wars;

import java.util.Scanner;

/**
 *
 * @author Tim Harshman
 */
public class RobotWars {


    public static void main(String[] args) {
        String robotName;
        int weaponChoice;
        
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
        robotName = keyboard.next();//Collect user robot name
        Robot player1 = new Robot(robotName);//assign user robot
        System.out.println("Choose your weapon.");
        
        for(int i = 0;i<Robot.weapons.length;i++){//Display weapon choices
            System.out.println(i+" "+Robot.weapons[i]);
        }
        
        weaponChoice = keyboard.nextInt();
        player1.setWeapon(weaponChoice);
        
        Robot goteamtim = new Robot("MogDroid");
        Robot monaLisa = new Robot("Mona Lisa");
        
        goteamtim.setWeapon(1);
        goteamtim.attack(monaLisa);
        goteamtim.displayStats();
        monaLisa.displayStats();
        monaLisa.attack(goteamtim);
        monaLisa.attack(goteamtim);
        goteamtim.displayStats();
        monaLisa.displayStats();
        
        
        
    }
}
