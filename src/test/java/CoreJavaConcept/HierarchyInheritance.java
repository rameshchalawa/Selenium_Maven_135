package CoreJavaConcept;

/*
Inheritance: 
Acquiring all the properties (Variables) & behavior (methods) from one class to another class is called inheritance.

Objective
1. re-usability
2. Avoid duplication

types
1. single - single parent have single child
2. multi level - parent have child class and child class can have another child class
3. hierarchy - single parents have multiple child
4. multiple -multiple parents have single child(class does not support multiple inheritance we have to use interface)

Why class doesn't support multiple Inheritance?
whenever we create any class in java, that class bydefault extends from Object class. 
Object is root/parent class of all classes in java. Hence Parent 1 and Parent 2 class have some duplicate methods from Object class,
when child class try to acquire both parent's method.child class doesn't know which method need to acquire.
Hence ambiguity issue occurs.
 */

class Parent
{
    void display(int a)
    {
        System.out.println(a);
    }
}

class Child1 extends Parent
{
    void show(int b)
    {
        System.out.println(b);
    }
}

class Child2 extends Parent
{
    void print(int c)
    {
        System.out.println(c);
    }
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
        c1.display(100);  //method derived from parent class
        c1.show(200);

        Child2 c2=new Child2();
        c2.display(1000); //method derived from parent class
        c2.print(2000);
		
		

	}

}
