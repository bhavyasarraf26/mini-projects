//To import Classes contained in java.util package for standard input.
import java.util.*;
// Interface for the game.
interface SnakeWaterGunInterface {
	public void rulesAndRegulation();
	public void playerChoice();
	public void computerChoice();
	public String winnerAsPerChoice();
}
//Class containing all the necessary functions for game implementation.
class SnakeWaterGunImplementation {
	String player_choice; //To store player choice.
	String computer_choice; //To store computer choice.
	// Constructor to initialize above data members.
	SnakeWaterGunImplementation() {
		player_choice = "";
		computer_choice = "";
	}
	//Methods to display rules and regulations associated with the game.
	void rulesAndRegulation() {
		System.out.println("\nRules for the game :-");
		System.out.println("1.) Snake wins over Water and loose over Gun.");
		System.out.println("2.) Water wins over Gun and loose over Snake.");
		System.out.println("3.) Gun wins over Snake and loose over Water.");
		System.out.println("4.) Player will be given 5 attempts if he/she enters the choice incorrect. So be careful and follow the instructions as provided during the game.");
		System.out.println("5.) Computer choice will be displayed after you are done with your choice.");
		System.out.println("6.) After the match, result will be summed up.");
		System.out.println("Game will start soon. Be ready. All the best...\n");
		//Code to delay time.
		long start = System.currentTimeMillis();
		long end = start+5*1000;
		while (System.currentTimeMillis() < end) {

		}
	}
	//Method to get player choice.
	void playerChoice() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Snake, Water or Gun : ");
		player_choice = input.nextLine();
		int count = 1;
		//Incase player enters wrong choice.
		while (!player_choice.equalsIgnoreCase("Snake") && !player_choice.equalsIgnoreCase("Water") && !player_choice.equalsIgnoreCase("Gun") && count != 5) {
			System.out.print("You enetered wrong choice. Please re-enter : ");
			player_choice = input.nextLine();
			count++;
		}
		if (count == 5)
			player_choice = "";
	}
	//Method to get computer choice.
	void computerChoice() {
		String options[] = {"Snake", "Water", "Gun"};
		int indexOfOptions = (int)(Math.random()*10);
		while (indexOfOptions < 0 || indexOfOptions > 2) {
			indexOfOptions = (int)(Math.random()*10);
		}
		computer_choice = options[indexOfOptions];
		if (!player_choice.equalsIgnoreCase(""))
			System.out.println("Computer choice : "+computer_choice);
	}
	//Method to get the winner.
	String winnerAsPerChoice() {
		if (player_choice.equalsIgnoreCase(""))
			return "PlayerNotInterested";
		else if (player_choice.equalsIgnoreCase("Snake") && computer_choice.equalsIgnoreCase("Water"))
			return "Player";
		else if (player_choice.equalsIgnoreCase("Snake") && computer_choice.equalsIgnoreCase("Gun"))
			return "Computer";
		else if (player_choice.equalsIgnoreCase("Water") && computer_choice.equalsIgnoreCase("Snake"))
			return "Computer";
		else if (player_choice.equalsIgnoreCase("Water") && computer_choice.equalsIgnoreCase("Gun"))
			return "Player";
		else if (player_choice.equalsIgnoreCase("Gun") && computer_choice.equalsIgnoreCase("Snake"))
			return "Player";
		else if (player_choice.equalsIgnoreCase("Gun") && computer_choice.equalsIgnoreCase("Water"))
			return "Computer";
		else
			return "ComputerPlayer";
	}
}
//Main class.
class SnakeWaterGun {
	//Main method.
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter number of matches : ");
		int noOfMatches = input.nextInt(); //To input number of matches to be played.
		int numOfMatchesWonByPlayer = 0; //Store number of matches won by the player.
		int numOfMatchesWonByComputer = 0; //Store number of matches won by the computer.
		int numOfMatchesTie = 0; //Store number of tie matches.
		for (int i = 1; i <= noOfMatches; i++) {
			SnakeWaterGunImplementation session = new SnakeWaterGunImplementation(); //Object creation of SnakeWaterGunImplementation class.
			if (i == 1)
				session.rulesAndRegulation(); //For displaying rules and regulation.
			session.playerChoice(); //For player's choice.
			session.computerChoice(); //For computer's choice.
			String winnerOfSession = session.winnerAsPerChoice(); //To store the result of the current match.
			//If player wins.
			if (winnerOfSession.equalsIgnoreCase("Player")) {
				System.out.println("Congratulations!!! You won!!!");
				numOfMatchesWonByPlayer++;
			}
			//Else if computer wins.
			else if (winnerOfSession.equalsIgnoreCase("Computer")) {
				System.out.println("Sorry. You loss. Better try next time...");
				numOfMatchesWonByComputer++;
			}
			//Incase of tie.
			else if (winnerOfSession.equalsIgnoreCase("ComputerPlayer")){
				System.out.println("Ooops!!! It's a tie. Well played...");
				numOfMatchesTie++;
			}
			//Incase player is not interested.
			else {
				System.out.println("It seems you are not interested. Match over.");
				break;
			}
		}
		//To print the final score.
		System.out.println("\nNumber of matches you won : "+numOfMatchesWonByPlayer);
		System.out.println("Number of matches computer won : "+numOfMatchesWonByComputer);
		System.out.println("Number of matches tie : "+numOfMatchesTie);
	}
}