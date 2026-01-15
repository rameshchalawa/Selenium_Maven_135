package CoreJavaConcept;

/*
 Constructor:
1. Constructor name should be same as class name.
2. Constructor will never return a value (not even void)
3. We don’t specify the void
4. Constructor can take parameters/arguments
5. Constructor automatically invoked at the time of object creation.
6. Used for initializing the values of the variables.
 
 */

public class ConstructorDemo {
	
	    int x, y;

	    ConstructorDemo() { // default constructor
	        x = 100;
	        y = 200;
	    }

	    ConstructorDemo(int a, int b) { // parameterized constructor
	        x = a;
	        y = b;
	    }

	    void sum() {                    //Method
	        System.out.println(x + y);
	    }

	public static void main(String[] args) {
		
		//ConstructorDemo cd=new ConstructorDemo(); // invoke default constructor
	    ConstructorDemo cd=new ConstructorDemo(10,20); // parameterized constructor
	    cd.sum();

	}

}
