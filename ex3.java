import java.util.Random;
import java.util.Scanner;

class HeadsOrTails {
    public static void main(String[] args) {

        System.out.println("Who are you?");
        System.out.print("> ");

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println("Hello, "+ str+"!");
         
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

    }
}