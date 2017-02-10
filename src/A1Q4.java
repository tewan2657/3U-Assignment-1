
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Creating a new city called kitchener 
      City kitchener = new City();
      
      //creating two robots 
      Robot mike = new Robot(kitchener, 0, 0, Direction.SOUTH);
      Robot carl = new Robot(kitchener, 0, 1, Direction.SOUTH);
      
      //creatin a wall
      new Wall(kitchener, 0, 1, Direction.WEST);
      new Wall(kitchener, 1, 1, Direction.WEST);
      new Wall(kitchener, 1, 1, Direction.SOUTH);
      
      //robots collide with each other
      carl.move();
      mike.move();
      carl.turnLeft();
      carl.move();
      mike.move();
      mike.turnLeft();
      carl.turnLeft();
      carl.turnLeft();
      carl.turnLeft();
      carl.move();
      carl.turnLeft();
      carl.turnLeft();
      carl.turnLeft();
      mike.move();
      carl.move();
      
      
    }
}
