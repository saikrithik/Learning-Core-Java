package semister_preperation;
class Animal2{
	int age = 100000;
	void eat() {System.out.println("Eating..");}}
class Cat2 extends Animal2{
	void eat() {System.out.println("Cat Eating..");}
	void meow() {System.out.println("Meowing..");}
	void invoke_superclass_method(){
		int age = super.age;
		super.eat();
		System.out.println("Age: "+age);
	}
}
public class method_overriding {
	public static void main(String[] args){
		Cat2 obj1 = new Cat2();
		obj1.eat();
		obj1.invoke_superclass_method();
	}
}
