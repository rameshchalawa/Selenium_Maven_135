package CoreJavaConcept;

class Animal {
    String color="white";
    
    void eat()
    {
    	System.out.println("eating....");
    }
}

class Dog extends Animal {
    String color="black";
    void displayColor() {
        System.out.println(super.color); //super keyword will be used to invoke the immediate parent class variable.
    }
    
    void eat()
    {
    	//System.out.println("eating dosa....");
    	super.eat(); //super keyword will be used to invoke the immediate parent class method.
    }
}

public class superkeyword {

	public static void main(String[] args) {
		
		Dog d=new Dog();
        d.displayColor();
        d.eat();

	}

}
