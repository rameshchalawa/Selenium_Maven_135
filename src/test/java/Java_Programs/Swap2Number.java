package Java_Programs;

public class Swap2Number {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//Logic 1 - Single statement

		 b=a+b-(a=b);
		
		//Execution will start from right to left (a=b) b value will be assigned to a hence current a value is 20
		//then a+b=30-20=10, so b value is 10. number is swapped 

		System.out.println("After swapping values are.."+a+" "+b);
		
		
		//Logic 2
		
		/*
		a= a+b; //10+20 =30
		b= a-b; //30-20 =10
		a= a-b; //30-10 = 20
		
		System.out.println(" a: "+a+" b: "+b);
		
		//Logic 3 with multiplication
		
		int c = 5;
		int d = 10;
		
		System.out.println(" c: "+c+"  d: "+d);
		
		c= c*d; //5*10=50
		d=c/d;  //50/10 = 5
		c=c/d;  //50/5 = 10
		
		System.out.println(" c: "+c+"  d: "+d);
		*/
		
		//Logic4 - bitwise XOR (^) //XOR calculator url: http://easyonlineconverter.com/converters/bitwise-calculator.html 
		/*a=a^b; //10^20 =30
		b=a^b; //30 ^20=10
		a=a^b; //30^10=20*/

	}

}
