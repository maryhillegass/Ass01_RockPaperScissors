import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize
        boolean done = false;
        String playAgain = "";
        String playerA = "";
        String playerB = "";

        //Start the whole game
        do{
            //Get a move from player A (RPS or rps)
            do{
                //Prompt
                System.out.print("Player A please enter your move [R,P,S]: ");
                //Input
                playerA = in.nextLine();
                //Check for R,P,S
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")){
                    done = true;
                }
                //Reprompt
                else{
                    System.out.println("Player A you entered " + playerA + "\nPlease enter a valid choice R, P, or S.");
                }

            }while(!done);
            done = false; //reset for the next do while

            //Get a move from player B (RPS or rps)
            do{
                //Prompt
                System.out.print("Player B please enter your move [R,P,S]: ");
                //Input
                playerB = in.nextLine();
                //Check for R,P,S
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")){
                    done = true;
                }
                //Reprompt
                else{
                    System.out.println("Player B you entered " + playerB + "\nPlease enter a valid choice R, P, or S.");
                }

            }while(!done);
            done = false; //reset for the next do while
            //RPS Logic and Output

            if (playerA.equalsIgnoreCase("R")){
                //Player A Rock
                if (playerB.equalsIgnoreCase("R")){
                    //Player B Rock
                    System.out.println("Rock vs Rock. It's a tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    //Player B Paper
                    System.out.println("Paper covers Rock. Player B wins!");
                } else{
                    //Player B Scissors
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                //Player A Paper
                if (playerB.equalsIgnoreCase("R")){
                    //Player B Rock
                    System.out.println("Paper covers Rock. Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    //Player B Paper
                    System.out.println("Paper vs Paper. It's a tie!");
                } else{
                    //Player B Scissors
                    System.out.println("Scissors cut Paper. Player B wins!");
                }
            } else{
                //Player A Scissors
                if (playerB.equalsIgnoreCase("R")){
                    //Player B Rock
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    //Player B Paper
                    System.out.println("Scissors cut Paper. Player A wins!");
                } else{
                    //Player B Scissors
                    System.out.println("Scissors vs. Scissors. It's a tie!");
                }
            }


            //Ask if playing again
            do{
                //Prompt
                System.out.print("Would you like to play again [Y/N]: ");
                //Input
                playAgain = in.nextLine();
                //Check for Y/N
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")){
                    done = true;
                }
                //Reprompt
                else{
                    System.out.println("You entered " + playAgain + "\nPlease enter either Y or N.");
                }

            }while(!done);
            //If not done make done = false
            if(playAgain.equalsIgnoreCase("Y")){
                done = false;
            }

        }while (!done);
    }
}
