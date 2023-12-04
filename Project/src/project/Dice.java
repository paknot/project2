
package project;
import java.util.Random;

public class Dice {
      Random random = new Random();
     
    int Roll(){ 
        return random.nextInt(6) + 1;
    }
}

