package semister_preperation;
import java.util.Scanner;
public class loops_in_java {
	Scanner scan = new Scanner(System.in);
	
	public void while_loop() 
	{
		System.out.println("give an input");
		int num = scan.nextInt();
		int collector = 0;
		while(num!=0)
		{
			collector += num;
			num--;
		}
		System.out.println("sum of given digits ="+collector);
	}
	public void for_loop() 
	{
		System.out.println("give an input");
		int num = scan.nextInt();
		int collector = 0;
		for(int i =0;i<=num;i++ )
		{
			collector += i;
		}
		System.out.println("sum of given digits ="+collector);
	}
	public void do_while_loop() 
	{
		System.out.println("give an input");
		int num = scan.nextInt();
		int collector = 0;
		do
		{
			collector += num;
			num--;
		}while(num!=0);
		System.out.println("sum of given digits ="+collector);
	}
	
	public static void main(String[] args)
	{
		loops_in_java class_obj = new loops_in_java();
		//class_obj.while_loop();
		//class_obj.for_loop();
		class_obj.do_while_loop();
	}
}
