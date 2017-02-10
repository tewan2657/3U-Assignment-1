
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Creating a new city called kitchener 
      City kitchener = new City();
      
      //creating a robot 
      Robot carl = new Robot(kitchener, 3, 0, Direction.EAST);
      
      //place flag 
      new Thing(kitchener, 3, 1);
      
      //creating mountain 
     new Wall(kitchener, 3, 2, Direction.WEST);
     new Wall(kitchener, 3, 2, Direction.NORTH);
     new Wall(kitchener, 2, 3, Direction.WEST);
     new Wall(kitchener, 1, 3, Direction.WEST);
     new Wall(kitchener, 1, 3, Direction.NORTH);
     new Wall(kitchener, 1, 3, Direction.EAST);
     new Wall(kitchener, 2, 4, Direction.NORTH);
     new Wall(kitchener, 2, 4, Direction.EAST);
     new Wall(kitchener, 3, 4, Direction.EAST);
  
     //robot grabs flag
     carl.move();
     carl.pickThing();
     
     //robot climbs to the top of the mountain 
     carl.turnLeft();
     carl.move();
     carl.turnLeft();
     carl.turnLeft();
     carl.turnLeft();
     carl.move();
     carl.turnLeft();
     carl.move();
     carl.move();
     carl.turnLeft();
     carl.turnLeft();
     carl.turnLeft();
     carl.move();
     
     //robot places flag on top of mountain
     carl.putThing();
     
     //robot decends down the mountain 
     carl.move();
     carl.turnLeft();
     carl.turnLeft();
     carl.turnLeft();
     carl.move();
     carl.turnLeft();
     carl.move();
     carl.turnLeft();
     carl.turnLeft();
     carl.turnLeft();
     carl.move();
     carl.move();
     carl.turnLeft();



   
   
     
 

     


     
    }
}
