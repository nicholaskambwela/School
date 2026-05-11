import java.util.*;


public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        Random ran = new Random();

        int randNum = ran.nextInt(100) + 1;
        //System.out.println("xx");

        System.out.println("=============================================================================================================");
        System.out.println("This is a number guessing game. A random number between(1 - 100) has been generated try to guess the number: ");
        System.out.println("==============================================================================================================");

        System.out.print("Enter your first guess: ");
        int userInput = sca.nextInt();
        boolean correct = false;

        boolean tryAgain = false;
        
        String playAgain = sca.nextLine();
        String agree = "yes";

        while(correct == false){
            if(userInput == randNum){
            System.out.println("Correct!!");
            System.out.println("Would you like to play again(yes/no): ");
            playAgain = sca.nextLine();
            if(playAgain.equalsIgnoreCase(agree)){
                randNum = ran.nextInt(100) + 1;
                System.out.println("=============================================================================================================");
                System.out.println("This is a number guessing game. A random number between(1 - 100) has been generated try to guess the number: ");
                System.out.println("==============================================================================================================");
                System.out.print("Enter your first guess: ");
                userInput = sca.nextInt();
                correct = false;
            }else{
                System.out.println("Thank you for playing!!");  
            }          
        }else if(randNum < userInput){
            System.out.println("The correct number is less than : " + userInput);
            System.out.println("Please try again.");
            userInput = sca.nextInt();

        }else if(randNum > userInput){
            System.out.println("The correct number is greater than: " + userInput);
            System.out.println("Please try again.");
            userInput = sca.nextInt();
           }
        }

        

       
        
    }
}