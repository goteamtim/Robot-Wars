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
    
    
    public Robot(){
        this.life = 100;
        this.name = "No name yet.";
    }
    
    public Robot(String a){
        this.name = a;
        this.life = 100;
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
    
    public void setWeapon(){
        this.weapon = true;
        System.out.println(this.name+" picked up a weapon!");
    }
}
