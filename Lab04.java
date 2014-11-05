/**
*
* Description of the program goes here  // provide a brief description
*
* @author Jack Navin-Weinstein  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Lab04 {


 public static void takeTheField(Athlete arg){
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
 }
     public static void main(String[] args) {
     Display.openWorld("maps/arena.map");
     Display.setSize(10, 10);
     Display.setSpeed(5);
     
     Robot coach = new Robot(1,7,Display.EAST,0);
     Athlete Courtois = new Athlete();
     Athlete Hazard = new Athlete();
     Athlete Costa = new Athlete();
     Athlete Jack = new Athlete();
     Athlete Fabregas = new Athlete();
     Athlete Willian = new Athlete();
     
     takeTheField(Courtois);
     takeTheField(Hazard);
     takeTheField(Costa);
     takeTheField(Jack);
     takeTheField(Fabregas);
     takeTheField(Willian);
     
     Courtois.move();
     Courtois.move();
     Courtois.move();
     Courtois.turnLeft();
     Courtois.move();
     Courtois.move();
     Courtois.turnAround();
     
     Hazard.move();
     Hazard.move();
     Hazard.move();
     Hazard.move();
     Hazard.move();
     Hazard.turnLeft();
     Hazard.move();
     Hazard.turnAround();
     
     Costa.move();
     Costa.move();
     Costa.move();
     Costa.move();
     Costa.turnRight();
     
     Jack.move();
     Jack.move();
     Jack.move();
     Jack.turnRight();
     
     Fabregas.move();
     Fabregas.move();
     Fabregas.turnRight();
     
     Willian.move();
     Willian.turnLeft();
     Willian.move();
     Willian.turnAround();
     
     Jack.turnrightAround();
     
     }
}
