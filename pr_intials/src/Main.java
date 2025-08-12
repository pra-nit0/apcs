import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
  	World.setDelay(10);
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(3,1,North,100);
		
    // examples of commands you can invoke on a Robot
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move(); 
        
    
    Robot c = new Robot(3,5,North,100);
    c.putBeeper();
    c.move();
    c.putBeeper();
    c.move();
    c.putBeeper();
    c.move();
    c.putBeeper();
    c.turnLeft();
    c.turnLeft();
    c.turnLeft();
    c.move();
    c.putBeeper();
    c.move();
    c.putBeeper();
    c.turnLeft();
    c.move();
    c.putBeeper();
    c.move();
    c.putBeeper();
    c.turnLeft();
    c.move();
    c.putBeeper();
    c.move();
    c.putBeeper();
    c.turnLeft();
    c.move();
    c.putBeeper();
    c.move();
    c.move();
    c.turnLeft();
    c.move();
    c.putBeeper();
    c.turnLeft();
    c.turnLeft();
    c.turnLeft();
    c.move();
    c.turnLeft();
    c.move();
    c.putBeeper();
    c.turnLeft();
    c.turnLeft();
    c.turnLeft();
    c.move();
    c.turnLeft();
    c.move();
    c.putBeeper();
    
    


  }
  
}
