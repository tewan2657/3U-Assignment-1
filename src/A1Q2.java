
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
public class A1Q2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
     //creating a new city called kitchener 
        City kitchener = new City();
        
        //creating a robot
        Robot carl = new Robot(kitchener, 1, 2, Direction.SOUTH);
        
        //creating a house 
        new Wall(kitchener, 1, 2, Direction.SOUTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);

        //placing newspaper on the front porch
        new Thing(kitchener, 2, 2);        
        
        //robot picks up newspaper 
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.turnLeft();
        carl.move();
        carl.turnLeft();
        carl.move();
        carl.pickThing();
        
        //robot makes his way back to bed
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        
        //place newspaper 
        carl.putThing();
        

    

      
    

    }     
}
    
