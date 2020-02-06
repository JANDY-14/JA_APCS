import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    // class cluster
    World worldT = new World(420,420);
    Turtle ralph = new Turtle(worldT);
    //line up 
    ralph.forward();
    ralph.forward();
   //line right 
    ralph.turnRight();
    ralph.forward();
    ralph.forward();
    //line down on right side
    ralph.turnRight();
    ralph.forward();
    ralph.forward();
    ralph.forward();
    ralph.forward();
    //line on the bottom
    ralph.turnRight();
    ralph.forward();
    ralph.forward();
    ralph.forward();
    ralph.forward();
    //line going up the right side
    ralph.turnRight();
    ralph.forward();
    ralph.forward();
    ralph.forward();
    ralph.forward();
   //line right 2 
   ralph.turnRight();
   ralph.forward();
   ralph.forward();
  //line going to the middle 
  ralph.turnRight();
  ralph.forward();
  ralph.forward();
  // line going to the left from the middle 
  ralph.turnRight();
  ralph.forward();
  ralph.forward();
  // line from the left back to the middle
  ralph.turnRight();
  ralph.turnRight();
  ralph.forward();
  ralph.forward();
  // line to the right from the middle
  ralph.forward();
  ralph.forward();
  // return to the middle
  ralph.turnRight();
  ralph.turnRight();
  ralph.forward();
  ralph.forward();
  ralph.turnLeft();
  //line to the bottom 
  ralph.forward();
  ralph.forward();
  // return to middel 
  ralph.turnRight();
  ralph.turnRight();
  ralph.forward();
  ralph.forward();
  ralph.turnLeft();
  ralph.turnRight();
  //comment update







    //Finally, set the world to be visible with a boolean. Ex: worldName.setVisible(the proper boolean);
  }
}
