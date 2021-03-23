
public class Player {
	int Number;
	public int Guess()
	{
		Number = (int)(Math.random() * 100 + 1);
		return Number;
	}
}
