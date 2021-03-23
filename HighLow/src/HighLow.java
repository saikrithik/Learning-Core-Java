import java.util.Scanner;

public class HighLow 
{
	Scanner scan = new Scanner(System.in);
	// Instantiating Object for Player Class
	Player playerobj = new Player();
	
	// Ask for Number of players that are playing
	// Returns the No. of players(int)
	public  int Asknumplayers()
	{
		int ask;
		System.out.println("WELCOME");
		System.out.println("Select No. of Players: '1' for One Player  '2' for Two Players");
		ask  = scan.nextInt();
		return ask;
	}

	// Method for 1 player game with Computer
	public void oneplayergame(int max_turns) 
	{
		// Create a random number for the user to guess
		int theNumber = (int)(Math.random() * 100 + 1);
		// Calling While_Loop with parameters (No.to guess , who_gives_the_no. , Max no. of turns)
		new HighLow().while_loop(theNumber,"Computer",max_turns);
	}
	
	// Method for 2 player game with 2 options 
	//parameters(Option selected ,  Max no. of turns)
	public void twoplayergame(int ask,int max_turns) 
	{
		if (ask == 1) 
		{
			System.out.println("Player2 Turn to Give a no. Between 0-100");
			// input the Number from Player2
			int theNumber = scan.nextInt();
			// Calling While_Loop with parameters (No.to guess , who_gives_the_no. , Max no. of turns)
			new HighLow().while_loop(theNumber,"Player2",max_turns);
		} // End of If Condition of 1
		else
		{
			System.out.println("Player1 Turn to Guess");
			// Create a random number for the user to guess
			int theNumber = (int)(Math.random() * 100 + 1);
			int player1_turns, player2_turns;
			// Player1 turn to Play with the Computer
			// Calling Raw While Loop method with parameters (No.to guess , which player's turn)
			player1_turns = new HighLow().raw_while_loop(theNumber,1);
			System.out.println("Player2 Turn to Guess");
			// Create another random number for the user to guess
			theNumber = (int)(Math.random() * 100 + 1);
			// Player1 turn to Play with the Computer
			// Calling Raw While Loop method with parameters (No.to guess , which player's turn)
			player2_turns = new HighLow().raw_while_loop(theNumber,2);
			if(player1_turns>player2_turns)
				System.out.println("Player2 wins with just "+player2_turns+" turns!!");
			else
				System.out.println("Player1 wins with just "+player1_turns+" turns!!");
		}
	}
	
	// Method for Recording No. of turns a player takes to Guess the Number
	// Parameters (No.to guess , which player's turn)
	// Returns No. of turns the player took
	public int raw_while_loop(int theNumber,int player) 
	{
		int turns = 0;
		int guess = 0;
		while (guess != theNumber)
		{
			turns = turns+1;
			// accessing Player Class with playerobj and calling the myplayer function
			// Returns the Integer that has been guessed by the User
			guess = playerobj.myplayer(player);
			if (guess < theNumber)
				System.out.println(guess + " is too low. Try again.");
			else if (guess > theNumber)
				System.out.println(guess + " is too high. Try again.");
			else
				System.out.println(guess + " is correct. You win!");
			}// End of while loop for guessing
		return turns;
		}
	
	// Method to Stop the While_loop if it crosses max_turns
	// Parameters (No.to guess , who_gives_the_no. , Max no. of turns)
	public void while_loop(int theNumber,String player2,int max_turns) 
	{
		int guess = 0;
		while (guess != theNumber)
		{
			System.out.println( "No. of Turns Left : "+ max_turns);
			max_turns = max_turns-1;
			// accessing Player Class with playerobj and calling the myplayer function
			// Returns the Integer that has been guessed by the User
			guess = playerobj.myplayer(1);
			if (guess < theNumber)
				System.out.println(guess + " is too low. Try again.");
			else if (guess > theNumber)
				System.out.println(guess + " is too high. Try again.");
			else
				System.out.println(guess + " is correct. Player1 win!");
			if (max_turns==0) 
			{
				System.out.println( "The Number is....."+theNumber+ " !");
				System.out.println( " Oops you are out of turns! You Loose, "+player2+" Wins! ");
				break;
			}
			}// End of while loop for guessing
	}
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int ask,ask2;
		int max_turns = 8;
		// Calling Asknumplayers and storing the input in ask
		ask = new HighLow().Asknumplayers();
		if (ask == 1) 
		{
			System.out.println("Computer Gives the number, Player1 needs to Guess it in less than " +max_turns+" turns");
			// Calling oneplayergame
			new HighLow().oneplayergame(max_turns);
		}
			else 
		{
			System.out.println("2 Players Game Modes");
			System.out.println("-->	1. Player2 Gives the number,  Player1 needs to Guess it in less than " +max_turns+" turns");
			System.out.println("-->	2. Computer Gives the number, the player who guesses the number 'fastest' will win");
			ask2 = scan.nextInt();
			// Calling twoplayergame
			new HighLow().twoplayergame(ask2,max_turns);
		}
	}
}