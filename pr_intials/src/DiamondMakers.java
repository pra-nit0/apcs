import kareltherobot.*;
import java.util.Scanner;
// Change class Later
public class Main implements Directions{
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("How large do you want your diamond to be? (square ENTER INT ): ");
      int plot = scanner.nextInt();
    World.setSize(plot*2-1, plot*2 -1);
    World.setVisible(true);// allows us to see the run
    World.setDelay(1); //robot tick speed


    Robot r = new Robot(plot,1,East,infinity); //robot defined
		int i = 0; //assign variable i
    int j = 0;
    for (j = 0; j < 4; j++) {
      for (i = 0; i < plot-1; i++) {
        r.putBeeper();
        r.move();
        r.turnLeft();
        r.turnLeft();
        r.turnLeft();
        r.move();
        r.turnLeft(); }
      r.turnLeft();
      }
  }
  }
