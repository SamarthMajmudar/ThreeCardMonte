
import java.util.Scanner;
public class ThreeCardMonte {
            public static void main(String [] args){
                Scanner kb = new Scanner(System.in);
                boolean playAgain = true;
                int win = 0;
                int lose = 0; 
                while(playAgain == true){
                
                int random_number = (int)(1 + Math.random()*3);
                System.out.println("O O O");
                System.out.println("What cup do you think the ball is in. Enter your answer as a number 1-3");
                int guess = kb.nextInt();
                if(guess == random_number && random_number == 1){
                     System.out.println("# O O");
                     System.out.println("Congrats you win");
                     win = win + 1;
                }
                if(guess != random_number && random_number == 1){
                     System.out.println("# O O");
                     System.out.println("You did not pick the right cup");
                     lose = lose + 1;
                }
                if(guess == random_number && random_number == 2){
                     System.out.println("O # O");
                     System.out.println("Good job, you picked the right cup");
                     win = win + 1;
                }
                if(guess != random_number && random_number == 2){
                     System.out.println("O # O");
                     System.out.println("You lose");
                     lose = lose + 1;
                }
                if(guess == random_number && random_number == 3){
                     System.out.println("O O #");
                     System.out.println("Nice work picking the right cup");
                     win = win + 1;
                }
                if(guess != random_number && random_number == 3){
                     System.out.println("O O #");
                     System.out.println("Unfortunate! You picked the picked the wrong cup!");
                     lose = lose + 1; 
                }
                System.out. println("Your record is " + win + "-" + lose);
                System.out.println("Do you want to play again? Type any key to continue, type no to exit the program.");
                String again = kb.next();
                

                if(again.equalsIgnoreCase ("no")){
                    playAgain = false;
                }
                
                
                
                
            }
     }
}
