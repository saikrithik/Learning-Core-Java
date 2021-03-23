// importing scanner library 
import java.util.Scanner;
//Defining Email Class
public class Email {
	// Defining method to create ID
	public String CreateID(String first, String last,String dept,String company) 
	//Defining Parameters required for the method
	{
		//Defining temp email parameter
		String email;
		// Concatenating strings in to email format
		email = first+"_"+last+"."+dept+"@"+company+".com";
		//return the email variable
		return  email;
	}
	//Defining Password Class with a int to mention no. of characters of password
	public String CreatePWD(int n)
	{
		// creating a string with all the Alpha Numeric characters
		 String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                 + "0123456789"
                 + "abcdefghijklmnopqrstuvxyz"; 
		 // create StringBuffer size of AlphaNumericString (like a list of characters)
		 StringBuilder sb = new StringBuilder(n); 


		// Iterating till range of “n” to append random character to the stringbuffer
		 for (int i = 0; i < n; i++) { 
			 // generate a random number between 
			 // 0 to AlphaNumericString variable length 
			 int index = (int)(AlphaNumericString.length() * Math.random()); 
			 // add Character one by one in end of sb
			 sb.append(AlphaNumericString.charAt(index)); 
		 	} 
		 //above Snippet is referred from :
		 //https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/
		 // type converting the buffer to string and returning it
		 return sb.toString();
	}

//Defining main method
	public static void main(String[] args) {
		// Instantiating a scanner object
		Scanner scan = new Scanner(System.in);
		// Defining Necessary Variables of different types
		String First,Last,Dept,Comp,PWD;
		int YN;
		// Process flow as mentioned XD in the project, not totally completed
		// But, This is the basic flow of application
		System.out.println("Enter  First Name");
		First = scan.next();
		System.out.println("Enter  Last Name");
		Last = scan.next();
		System.out.println("Enter  Department Name[ece,cse, etc.]");
		Dept = scan.next();
		System.out.println("Enter  Company Name");
		Comp = scan.next();
		// Here instead of making an object and calling the method i am directly calling the methods
		System.out.println("Your email : "+new Email().CreateID(First,Last,Dept,Comp));
		System.out.println("Generated Password : "+new Email().CreatePWD(8));
		System.out.println("Click '1' to keep custom password '0' to exit with same");
		YN = scan.nextInt();
		if (YN==1 || YN ==0){
			System.out.println("Enter Password : ");
			PWD = scan.next();
			System.out.println("Your email : "+new Email().CreateID(First,Last,Dept,Comp));
			System.out.println("Password : "+PWD);
		}
	}
}
