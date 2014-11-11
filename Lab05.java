/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Riley Evans>
* @version <Nov. 11, 2014>
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {

     public static void main(String[] args) {
     Display.openWorld("maps/shuttle.map");
     Display.setSize(10,10);
     Display.setSpeed(15);
      
      Racer spence = new Racer(1);
      Racer dana = new Racer(4);
     Racer rob = new Racer(7);
      
     spence.shuttle(2,8); 
      spence.shuttle(4,6);
      spence.shuttle(6,4); 
      spence.move();
      
      dana.shuttle(2,8); 
      dana.shuttle(4,6);
      dana.shuttle(6,4);    
      dana.move();
      
      rob.shuttle(2,8); 
      rob.shuttle(4,6);
      rob.shuttle(6,4);
      rob.move();

    }
}
