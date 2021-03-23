package semister_preperation;
class Animal{
	//private Animal() {
	//}
	void eat() {System.out.println("eating....");}
}
class Cat extends Animal{
	void meow() {System.out.println("meowing...");}
}
class Dog extends Animal{
	void bark() {System.out.println("barking...");}
}
class inheritance_test{
	public static void main(String[] args) {
	Dog obj1 = new Dog();
	Cat obj2 = new Cat();
	obj1.eat();
	obj1.bark();
	obj2.eat();
	obj2.meow();
	}
}