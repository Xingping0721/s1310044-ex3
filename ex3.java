import java.util.Random;
import java.util.Scanner;

class HeadsOrTails {
    public static void main(String[] args) {
         
        System.out.println("Tossing a coin...");

        Random rand = new Random();
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < 3; i++) {

            int num = rand.nextInt(10) + 100;

            System.out.print("Round "+ (i+1) + ": ");
            if(num%2 == 0){
                System.out.println("Heads");
                heads++;
            }
            else{
                System.out.println("Tails");
                tails++;
            }
        }

        System.out.println("Heads: " + heads + ", Tails: " + tails);

        if(heads>tails){
            System.out.println("You won");
        } 
        else {
            System.out.println("You lost");
        }
    }
}