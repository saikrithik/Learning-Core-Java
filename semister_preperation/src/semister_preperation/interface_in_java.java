package semister_preperation;
interface Printable{
	void print();
	void video();
}

abstract class Showable implements Printable{
	public void video() {System.out.println("video playing");}
}
class Test_interface extends Showable{
	public void print() {System.out.println("Printable print");}
	public void show() {System.out.println("Showable show");}
	public static void main(String[] args) {
		Test_interface obj1= new Test_interface();
		obj1.print();
		obj1.show();
		obj1.video();
	}
}