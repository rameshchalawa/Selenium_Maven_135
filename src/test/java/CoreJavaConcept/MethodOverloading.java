package CoreJavaConcept;

/*
 We can achieve polymorphism by using Method Overloading 
 4 Rules are applicable for Method Overloading
1. Method names should be same
2. Number of parameters should be different
3. Data type of parameters should be different
4. Order of parameters should be different

 */

public class MethodOverloading {
	
    int a=10, b=20;
    
    void sum() //1
    {
        System.out.println(a+b);
    }
    
    void sum(int x, int y) //2
    {
        System.out.println(x+y);
    }
    
    void sum(int x, double y) //3
    {
        System.out.println(x+y);
    }
    
    void sum(double x, int y) //4
    {
        System.out.println(x+y);
    }

    void sum(int a, int b, int c) //5
    {
    System.out.println(a+b+c);
    }

	public static void main(String[] args) {
		
		MethodOverloading addobj=new MethodOverloading();
		addobj.sum(); //1
		addobj.sum(100,200); //2
		addobj.sum(10.5,20); //4
		addobj.sum(10,15.5); //3
		addobj.sum(10,20,30); //5
		
	}

}
