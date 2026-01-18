package CoreJavaConcept;
/*
1. An interface is a blue print of class.
2. variables in Interface are by default final & Static.
3. Methods in interface are public.
4. Interface contains abstract,default & Static methods.
5. An abstract method is a method contains declaration but not body(Un-implemented method).
5. Interface supports the functionality of multiple inheritance.
6. A class extends another class, an interface extends another interface but a class implements an interface.
7. We can create Object reference for Interface but we cannot instantiate interface.  
 */

   interface Shape {
    int Lenght = 10; // final & Static
    int width = 20; // final static

    void circle(); // abstract method

    default void square() {
        System.out.println("this is square - default method");
    }

    static void rectangle() {
        System.out.println("this is rectangle - static method");
    }
}

public class Interfacedemo implements Shape {
	
	public void circle()
	{
	    System.out.println("this is circle - abstract method..");
	}

	public static void main(String[] args) {
		
	    Shape sh=new Interfacedemo();

	    sh.circle(); // abstract
	    sh.square(); // default
	    Shape.rectangle(); // static method can directly access from interface
	    System.out.println(Shape.Lenght); //static variable can directly access from interface
	    System.out.println(Shape.width);  //static variable can directly access from interface
	    
	}

}
