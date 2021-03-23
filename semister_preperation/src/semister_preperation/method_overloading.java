package semister_preperation;

class Adder{
	static int add(int a,int b) {return a+b;}
	static double add(double a, double b)  {return a+b;}
}
class Test_method_loading{
	public static void main(String[] args) {
		System.out.println(Adder.add(15, 16));
		System.out.println(Adder.add(15.5,17.1));
	}
}