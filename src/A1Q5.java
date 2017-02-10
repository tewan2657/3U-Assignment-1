
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitchener 
      City kitchener = new City();
      
      //creating a robot 
      Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
      Robot karel = new Robot(kitchener,  3, 3, Direction.EAST);
      
      //building a house for karel
      new Wall(kitchener, 2, 3, Direction.EAST);
      new Wall(kitchener, 2, 3, Direction.NORTH);
      new Wall(kitchener, 2, 3, Direction.WEST);
      new Wall(kitchener, 3, 3, Direction.EAST);
      new Wall(kitchener, 3, 3, Direction.SOUTH);

      //placing groceries 
      new Thing(kitchener, 0, 0);
      new Thing(kitchener, 1, 0);
      new Thing(kitchener, 1, 1);
      new Thing(kitchener, 1, 2);
      new Thing(kitchener, 2, 2);
      
      // maria and karel pick up the groceries 
      karel.turnLeft();
      karel.turnLeft();
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
      maria.move();
      karel.move();
      maria.pickThing();
      karel.pickThing();
      maria.turnLeft();
      karel.move();
      maria.move();
      karel.pickThing();
      maria.pickThing();
      karel.turnLeft();
      maria.turnLeft();
      maria.move();
      maria.pickThing();
      
    }
}
