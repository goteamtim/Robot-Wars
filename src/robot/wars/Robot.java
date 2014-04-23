package robot.wars;

/**
 *
 * @author Tim Harshman
 */
public class Robot {
    private int life;
    private String name;
    
    
    public Robot(){
        this.life = 100;
        this.name = "No name yet.";
    }
    
    public Robot(String a){
        this.name = a;
        this.life = 100;
    }
    
    public void attack(Robot a){
        if
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
}
