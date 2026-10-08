import java.util.Scanner;
class RockPaperScissors
{
    public static void main(String[] args)
    {
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        String playerAMove = "";
        String playerBMove = "";
        String playAgain = "";
        do
        {

            // Get player A's move
            do {
                System.out.print("Player A, enter your move here: ");
                playerAMove = scanner.nextLine();

                if (!playerAMove.equalsIgnoreCase("R") && !playerAMove.equalsIgnoreCase("P") && !playerAMove.equalsIgnoreCase("S")) {
                    System.out.println("Invalid move. Please enter R, P, or S.");
                }
            }
            while (!playerAMove.equalsIgnoreCase("R") && !playerAMove.equalsIgnoreCase("P") && !playerAMove.equalsIgnoreCase("S"));

            // Get player B's move
            do {
                System.out.print("Player B, enter your move here: ");
                playerBMove = scanner.nextLine();

                if (!playerBMove.equalsIgnoreCase("R") && !playerBMove.equalsIgnoreCase("P") && !playerBMove.equalsIgnoreCase("S"))
                {
                    System.out.println("Invalid move. Please enter R, P, or S.");
                }
            }
            while (!playerBMove.equalsIgnoreCase("R") && !playerBMove.equalsIgnoreCase("P") && !playerBMove.equalsIgnoreCase("S"));

            // Cross product selection
            if (playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs. Rock. It's a tie!");
            } else if (playerBMove.equalsIgnoreCase("P") && playerAMove.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock. Player B wins!");
            } else if (playerBMove.equalsIgnoreCase("S") && playerAMove.equalsIgnoreCase("R"))
            {
                System.out.println("Rock breaks Scissors. Player A wins!");
            } else if (playerAMove.equalsIgnoreCase("P") && playerBMove.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock. Player A wins!");
            } else if (playerBMove.equalsIgnoreCase("P") && playerAMove.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs. Paper. It's a tie!");
            } else if (playerBMove.equalsIgnoreCase("S") && playerAMove.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cuts Paper. Player B wins!");
            } else if (playerAMove.equalsIgnoreCase("S") && playerBMove.equalsIgnoreCase("R"))
            {
                System.out.println("Rock breaks Scissors. Player B wins!");
            } else if (playerBMove.equalsIgnoreCase("P") && playerAMove.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors cuts Paper. Player A wins!");
            } else if (playerBMove.equalsIgnoreCase("S") && playerAMove.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors vs. Scissors. It's a tie!");
            }

            // Ask if players want to play again
            do
            {
                System.out.print("Would you like to play again? (Y/N): ");
                playAgain = scanner.nextLine();

                if (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N"))
                {
                    System.out.println("Invalid input. Please enter Y or N.");
                }
            }
            while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N"));
        }
            while (playAgain.equalsIgnoreCase("Y"));
        }
    }

