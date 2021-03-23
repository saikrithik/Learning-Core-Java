// importing scanner library 
import java.util.Scanner;

public class Player 
{
	Scanner scan = new Scanner(System.in);
	// Guesses the No. by user input
	public int myplayer(int player) 
	{
		System.out.println("Player "+player+" Turn");
		System.out.println("Guess a number between 1 and 100:");
		int guess;
		guess = scan.nextInt();
		return guess;
	}
}
