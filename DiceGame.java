import java.util.Scanner;

public class DiceGame{

    public static void main(String[] args) {
        
        System.out.println("Welcome to the DiceGame. It's you against the computer.\n"
                        + "You play by rolling the dice. The first player to get 100 points wins.\n"
                        + "However, if you roll one 1 you lose all the points you've accumulated in your turn.\n"
                        + "If you roll two 1's, you lose all your points.\n"
                        + "You can turn the dice over at any time. However, if you roll one or two 1's, you lose your turn.\n"
                        + "I (the computer) play by the same rules, except I'll always turn over the dice when I've rolled 20 or more points in a single turn.");
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Ready to begin? (Type 'yes' when you're ready) ");
        String input = scan.nextLine();

        if(!input.equals("yes")){
            
            System.out.println("Goodbye!");
            return;
        }

        PairOfDice playerDice = new PairOfDice();
        PairOfDice computerDice = new PairOfDice();

        int playerTotalScore = 0;
        int computerTotalScore = 0;
        int playerTurnScore = 0;
        int computerTurnScore = 0;

        boolean playerTurn = true;
        boolean computerTurn = false;

        while(playerTotalScore < 100 && computerTotalScore < 100) {

            if(playerTurn) {
                
                System.out.println("\nYou're rolling dice...");
                playerDice.roll();
                System.out.println("You rolled " + playerDice.getDie1() + " "+ playerDice.getDie2());

                if (playerDice.getDie1() == 1 && playerDice.getDie2() == 1){

                    playerTotalScore = 0;
                    playerTurnScore = 0;
                    System.out.println("You've got two 1's!");
                    playerTurn = false;
                    computerTurn = true;

                } else if (playerDice.getDie1() == 1 || playerDice.getDie2() == 1) {

                    playerTurnScore = 0;
                    System.out.println("You've got a 1!");
                    playerTurn = false;
                    computerTurn = true;

                } else {

                    playerTurnScore += playerDice.getDiceSum();
                    System.out.println("This gives you a turn total of " + playerTurnScore);
                    System.out.println("and a grand total of " + (playerTotalScore + playerTurnScore));
                    System.out.println("The computer has a total of " + computerTotalScore);
                    if (playerTotalScore + playerTurnScore >= 100) {
                        System.out.println("You win!");
                        return;
                    }
                    System.out.println("Do you want to continue rolling? (Type 'yes' or 'no')");
                    input = scan.nextLine();
                    if (!input.equals("yes")) {
                        playerTotalScore += playerTurnScore;
                        playerTurnScore = 0;
                        playerTurn = false;
                        computerTurn = true;
                    }
                }

            } else if (computerTurn) {

                System.out.println("I'm rolling the dice...");
                computerDice.roll();

                System.out.println("I rolled " + computerDice.getDie1() + " " + computerDice.getDie2());

                if (computerDice.getDie1() == 1 && computerDice.getDie2() == 1){

                    computerTotalScore = 0;
                    computerTurnScore = 0;
                    System.out.println("I've got two 1's!");
                    computerTurn = false;
                    playerTurn = true;

                } else if (computerDice.getDie1() == 1 || computerDice.getDie2() == 1) {

                    computerTurnScore = 0;
                    System.out.println("I've got a 1!");
                    computerTurn = false;
                    playerTurn = true;

                } else {

                    computerTurnScore += computerDice.getDiceSum();
                    System.out.println("This gives me a turn total of " + computerTurnScore);
                    System.out.println("and a grand total of " + (computerTotalScore + computerTurnScore));
                    System.out.println("You have a total of " + playerTotalScore);
                    
                    if (computerTotalScore + computerTurnScore >= 100) {
                        
                        System.out.println("I win!\n"
                                        + "Better luck next time :D");
                        return;

                    } else if (computerTurnScore >= 20) {

                        computerTotalScore += computerTurnScore;
                        playerTurn = true;
                        computerTurn = false;
                    }
                }
            }
        }
    }
}