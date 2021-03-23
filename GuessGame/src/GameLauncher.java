import java.util.Scanner;

public class GameLauncher {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		GuessGame guessgameobj = new GuessGame();
		System.out.println( "Welcome!!");
		System.out.println( "Press 1 to start the Game , 0 to Exit.");
		int  ask  = scan.nextInt();
		if (ask==1)
		{
			guessgameobj.StartGame();
		}
		else
			System.out.println( "Okay Please visit again.");
	}

}
