package CoreJavaConcept;

/*
 Method Overriding:
1. Possible only in Multiple classes(inheritance).
2. We should NOT change the declaration(parameter) of the method but body(Implementation) we should change.
3. method names are same
4. belongs to inheritance

Method Overloading:
1. Possible in Single & Multiple classes(inheritance)
2. We should change the declaration(parameter) of the method
3. method names are same.
4. belongs to polymorphism
 */

  class ABC
  {
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
  }

  class XYZ extends ABC 
  {
    void m1(int a) //overriding
    {
        System.out.println(a*a); //Implementation changed
    }
    void m2(int a, int b) //overloading //declaration changed
    {
        System.out.println(a+b);
    }
  }

public class MethodOverloadingVsMethodOverriding {

	public static void main(String[] args) {
		
		XYZ obj=new XYZ();
        obj.m1(10);
        obj.m2(20);
        obj.m2(10,20);

	}

}
