package robot.wars;



/**
 *
 * @author Tim Harshman
 */
public class Robot {
    private int life;
    private String name;
    private boolean shield = false;
    private boolean weapon = false;
    private int activeWeapon;//Active weapon holds the index in the array of weapons.  Easier to call what weapon the robot currently holds
    
    public static String[] weapons = {
    "Cannon","Axe","Spike"};//Create a list of weapons that the robots can have
    
    public Robot(){//default constructor sets life to 100      
        this.life = 100;
        this.name = "No name yet.";
    }
    
    public Robot(String a){
        //weapons = new String[3];
        this.name = a;
        this.life = 100;
    }
    
    public Robot(String a, int b){
        this.name = a;
        if(b>=0 && b<=2){//Check for active weapon choice
            this.activeWeapon = b;
            this.weapon = true;
        }
        else{
            System.out.println("Weapon choice invalid, setting your weapon to "+weapons[0]+".");
            this.activeWeapon = 0;
            this.weapon = true;
        }
    }
    
    public void attack(Robot a){
        int hitPoints = 10;//initial damage that can be done
        if(this.weapon)//if the robot has a weapon they cause more damage
            hitPoints = 20;
        a.life -= hitPoints;//take damage away from the robots life
        System.out.println(this.name+" attacked "+a.name+".");
    }
    
    public void setLife(int a){
        this.life = a;
    }
    
    public int getLife(){
        return this.life;
    }
    
    public void displayStats(){
        System.out.println("Name: "+this.name);
        System.out.println("Life: "+this.life);
    }
    
    public void setShield(){//sets the shield to true
        this.shield = true;
    }
    
    public void setWeapon(int a){
        if(a>=0 && a<=2){//Check for active weapon choice
            this.activeWeapon = a;
            this.weapon = true;
            System.out.println(this.name+" picked up a weapon!");
        }
        else{
            System.out.println("Weapon choice invalid, setting your weapon to "+weapons[0]+".");
            this.activeWeapon = 0;
            this.weapon = true;
        }
        
    }
	
	public String toString(){
		String currentRobot = "Name: "+this.name+"\n"+"Life: "+this.life+"\n";
		return currentRobot;
	}
}
