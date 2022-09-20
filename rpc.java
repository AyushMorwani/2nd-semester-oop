import java.util.Scanner;
import java.util.Random;
public class rpc {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Random ran = new Random();
            System.out.println("Choose 0 for Rock, 1 for Paper and 2 for Scissors: ");
            int userChoice=scan.nextInt();
            String user = "";

            switch(userChoice){
                case 0 -> user = "Rock";
                case 1 -> user= "Paper";
                case 2 -> user = "Scissors"; 
            }
            
            int computerChoice=ran.nextInt(3);
            String computer = "";
            switch(computerChoice){
                case 0 -> computer = "Rock";
                case 1 -> computer ="Paper";
                case 2 -> computer = "Scissors";
            }
            if(computerChoice == userChoice){
                System.out.println("DRAW");
            } 
            else if(computerChoice == 0 && userChoice == 1 || computerChoice == 1 && userChoice == 2 || computerChoice == 2 && userChoice == 0){
                        System.out.println("User Wins");
                }
                else{
                    System.out.println("Computer Wins");
                }
                System.out.printf("Computer Choose - %s,\nUser Choose - %s", computer,user);
        }
        System.out.println();
        }
    }
        

    

