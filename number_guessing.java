import java.util.Random;
import java.util.Scanner;
public class number_guessing {
    public static void main(String[] args) {
        Random rand=new Random();
        int Guess=rand.nextInt(100);
//        System.out.println("Hint : "+Guess);
        Scanner sc=new Scanner(System.in);
        int user;
        int numguess=1;
        do {
            System.out.println("Guess the number : ");
             user=sc.nextInt();
            if (Guess<user){
                System.out.println("Lower number please!");
            }
            else if (Guess>user){
                System.out.println("Higher number please!");
            }
            else {
                System.out.println("You guessed it in "+numguess+" attempt");
            }
            numguess++;
        }while(Guess!=user);
    }
}
