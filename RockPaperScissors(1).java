import java.util.Scanner;

public class RockPaperScissors{
  public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;

    Scanner scan = new Scanner(System.in);
    int userInput = 0;
    int playerWins = 0;
    int computerWins = 0;

    while(userInput != 3){
      System.out.println("\nWelcome to Rock, Paper, Scissors! Please choose an option:\n"
      + "1. Start game\n2. Change number of rounds\n3. Exit application");
      userInput = scan.nextInt();
      switch(userInput){
        case 1:
          int playerScore = 0, compScore = 0;
          System.out.printf("\nThis match will be first to %d wins.\n", roundsToWin);
          while(playerScore < roundsToWin && compScore < roundsToWin) {
            Move comp = null, player = null;
            int random = (int) Math.floor(Math.random()*3) + 1;
            switch(random) {
              case 1:
                comp = rock;
                break;
              case 2:
                comp = paper;
                break;
              case 3:
                comp = scissors;
                break;
            }
            System.out.println("The computer has selected its move. Select your move:\n" + 
            "1. Rock\n2. Paper\n3. Scissors");
            int playerChoice = scan.nextInt();
            switch(playerChoice) {
              case 1:
                player = rock;
                break;
              case 2:
                player = paper;
                break;
              case 3:
                player = scissors;
                break;
              default:
                System.out.println("Invalid input!\n");
                continue;
            }
            System.out.printf("\nYou have chosen %s. Computer has chosen %s. ", player.getName(), comp.getName());
            int results = Move.compareMoves(player,comp);
            switch(results) {
              case 0:
                System.out.println("You have won the round!");
                playerScore++;
                break;
              case 1:
                System.out.println("Computer has won the round!");
                compScore++;
                break;
              case 2:
                System.out.println("The round ended in a tie!");
                break;
            }
            System.out.printf("Player - %d; Computer - %d\n\n", playerScore, compScore);
          }
          if(playerScore == roundsToWin) {
            System.out.println("You have won the match!");
          }
          else if(compScore == roundsToWin){
            System.out.println("Computer has won the match!");
          }
          break;
        case 2:
          System.out.println("\nHow many wins are needed to win a match? ");
          roundsToWin = scan.nextInt();
          System.out.printf("\nYou now need %d wins to win a match.\n", roundsToWin);
          break;
        case 3:
          System.out.println("");
          break;
        default:
          System.out.println("Invalid input!");
      }
    }
  }
}