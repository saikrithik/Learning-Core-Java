package semister_preperation;

public class constructor_overloading {
	int id; 
	int roll_num;
    String name;  
    //creating a parameterized constructor  
    constructor_overloading(int i,String n){  
    id = i;  
    name = n;  
    }  
    constructor_overloading(int i,String n,int rollno){  
        id = i;  
        name = n; 
        roll_num = rollno;
        }  
    //method to display the values  
    void display(){System.out.println(id+" "+name+" "+roll_num);}
}
class constructoroverloading_test{
    public static void main(String args[]){  
    //creating objects and passing values  
    	constructor_overloading s1 = new constructor_overloading(111,"Karan");  
    	constructor_overloading s2 = new constructor_overloading(222,"Aryan",156);  
    //calling method to display the values of object  
    s2.display();
    s1.display();
   }  
}
