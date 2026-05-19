import java.util.Scanner;

public class randomNumberGuess {
    public static void guessRandomNumber(){
        Scanner sc = new Scanner(System.in);
        //  genrate random number 1 time
        int number = 1 + (int)(100 * Math.random());
        int tryToAttempt = 5;

        System.out.println("Guess a random number between 1 to 100.");
        System.out.println("You have " + tryToAttempt + " attempts.");

        for(int i = 0; i< tryToAttempt; i++){
            System.out.print("chance "+ i + " ");
            int guessNumber = sc.nextInt();

            if(guessNumber == number){
                System.out.println("Congratulations, you are guessing a right number.....");
                sc.close();
                return ;
            }
            else if(guessNumber < number){
                System.out.println("Too low! Try bigger number.");
            }
            else{
                System.out.println("Too high! Try smaller number");
            }
        }
        System.out.println("all atempts are used, right number is "+ number);
        sc.close();
    }
    public static void main(String []args){
        guessRandomNumber();
    }
}