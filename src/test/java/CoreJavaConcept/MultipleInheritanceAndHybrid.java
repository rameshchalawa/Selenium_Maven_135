package CoreJavaConcept;

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
