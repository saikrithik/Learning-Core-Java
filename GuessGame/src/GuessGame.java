
public class GuessGame 
{
	Player p1 = new Player();
	Player p2 = new Player();
	int p1_guess, p2_guess;
	public void StartGame() 
	{
		int turns = 0;
		int computer_guess = new Player().Guess();
		
		while (true)
		{
			p1_guess = p1.Guess();
			p2_guess = p2.Guess();
			turns = turns+1;
			System.out.print( "Turn "+turns+":");
			if (computer_guess==p2_guess) 
			{
				System.out.println( "Player 2 Wins in "+turns+" turns!!");
				break;
			}
			else if (computer_guess==p1_guess) 
			{
				System.out.println( "Player 1 Wins in "+turns+" turns!!");
				break;
			}
			System.out.println( " Both players couldnt guess the number correct .");
		}
	}
	
}
