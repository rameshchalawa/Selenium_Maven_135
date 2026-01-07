package Java_Programs;

public class NumberSwap {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(" a: "+a+" b: "+b);
		
		a= a+b; //10+20 =30
		b= a-b; //30-20 =10
		a= a-b; //30-10 = 20
		
		System.out.println(" a: "+a+" b: "+b);
		
		//Method 2 with multiplication
		
		int c = 5;
		int d = 10;
		
		System.out.println(" c: "+c+"  d: "+d);
		
		c= c*d; //5*10=50
		d=c/d;  //50/10 = 5
		c=c/d;  //50/5 = 10
		
		System.out.println(" c: "+c+"  d: "+d);

	}

}
