/*
 * This is the arenas class.  This class holds the various arenas that the robots battle in.
 * Each arena has its own pitfalls and obstacles to deal with.  Each arena has a set battle
 * structure for the robots to deal with.
 */
package robot.wars;

/**
 *
 * @author Goteamtim
 */
public class Arenas {
    private int length;
    private int height;
	private boolean suddenDeath;
    //Idea here would be to have different sized arenas
    //and create boards based on 2d arrays
    
    public Arenas(int x, int y){
        length = x;
        height = y;
    }
	
	public Arenas(int x, int y, Robot a, Robot b){
		this.length = x;
		this.height = y;
		Robot z = a;//I need to reference the robots here, pass t
		Robot y = b;
		
	}
    
    public int getLength(){
        return length;
    }
    
    public int getHeight(){
        return height;
    }
	
	
}
