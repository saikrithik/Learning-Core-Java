package semister_preperation;

import java.util.Scanner;

public class conditional_statements {
	//1. if statement
	//2. nested if statement
	//3. if-else statement
	//4. if-else-if statement
	//5. Switch Case Statement
	static int a=44;
	static int b =45;
	static int c = 43;
static  void if_statement() 
{
	//The if statement is the most basic of all the control flow statements. 
	//The if statement tells our program to execute a certain section of code only if a particular test evaluates to true.
	System.out.println("a:"+a+",b:"+b+"c:"+c);
	if(a==b) 
		System.out.println("a equals b");
	if(a>b)
		System.out.println("a is greater than b");
	if(a<b)
		System.out.println("a is less than b");
}
static  void nested_if_statement() 
{
	 int a=75;
	 int b =45;
	 int c =44;
	 System.out.println("a:"+a+",b:"+b+"c:"+c);
	//An if statement inside another the statement.
	//If the outer if condition is true then the section of code under outer if condition would execute
	//and it goes to the inner if condition if the inner if condition statement is true.
	if(a>b)
	{
		
		if (a>c) 
		{
			System.out.println("a is greater than both b and c");
			System.exit(0);
		}
		System.out.println("a is greater than b");
	}
}
public  void if_else_statement()
{
	 int a=75;
	 int b =45;
	 System.out.println("a:"+a+",b:"+b+"c:"+c);
	//If a condition is true then the section of code under if would execute 
	//else the section of code under else would execute.
	if (a>b)
		System.out.println("a is greater than b");
	else
		System.out.println("b is greater than a");
}
static void if_else_if_statement()
{
	System.out.println("a:"+a+",b:"+b+"c:"+c);
	// combination of if and else where else can also ask for condition using else-if
	if (a>b)
		System.out.println("a is greater than b");
	else if(a>c)
		System.out.println("a is greater than c");
}
public static void main(String[] args) {
	//SWITCH CASES
	conditional_statements class_obj = new conditional_statements(); 
	System.out.println("YOU ARE USING SWITCH CASES");
	System.out.println("Condtions");
	System.out.println("1. if statement");
	System.out.println("2. nested if statement");
	System.out.println("3. if-else statement");
	System.out.println("4. if-else-if statement");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	switch(num) 
	{ 
    case 1: 
    	if_statement();
        break; 
    case 2: 
    	nested_if_statement();
        break; 
    case 3: 
    	class_obj.if_else_statement();
        break; 
    case 4: 
    	if_else_if_statement();
        break; 
    default:
		System.out.println("Value of default is "+num);
}
}
}