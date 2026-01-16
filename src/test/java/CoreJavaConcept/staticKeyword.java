package CoreJavaConcept;

public class staticKeyword {
	
	static int a=10; // static variable

	static void m1() // static
	{
	    System.out.println("this is m1 static method.....");
	}


	public static void main(String[] args) {
		
		//1) static methods can access static variable,methods directly ( without creating object).
	    System.out.println(a);
	    m1();
	    
	    /*2) If main method is in another class we need to specify class name before calling variable and object
	    System.out.println(staticKeyword.a);
	    staticKeyword.m1();	    
	     */
	    
	    
	    /*
	     class System
	     {
	     static PrintStream out;
	     }
	     
	     System.out.println() 
	     //System is predefined class in java, 
	     //out is static variable, 
	     //println() is method belongs to PrintStream predefined class
	     */
	    
	    
	    /*
	     public static void main(String[] args)
	     {
	     Public is access modifier JVM can access this call from anywhere
	     static is keyword JVM can access main method directly without creating any object
	     void means there is not return value for main method
	     main is method name
	     String[] is string array take as parameter
	     args is array variable, we can write any variable name in main method instead of this
	     }
	     */
	}

}
