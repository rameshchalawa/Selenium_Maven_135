package CoreJavaConcept;

/*
Hybrid Inheritance - combination of multiple and multilevel inheritance. It is a mix of two or more types of inheritance.
In Java, multiple inheritance is not supported through classes to avoid ambiguity, but it can be achieved
through interfaces. In this example, we have a class C2 that is extended by MultipleInheritanceAndHybrid, 
and it also implements two interfaces i1 and i2.
*/

public class MultipleInheritanceAndHybrid extends C2 implements i1, i2 {
	
	public void m1() {
        System.out.println(x);
    }
    public void m2() {
        System.out.println(y);
    }

	public static void main(String[] args) {
		
		MultipleInheritanceAndHybrid obj = new MultipleInheritanceAndHybrid();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
