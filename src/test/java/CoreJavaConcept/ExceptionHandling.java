package CoreJavaConcept;

//Refer HandleExceptins class for How to Handle Exception

/*
 Exception handling
Exception is an event which will cause program termination.

Types of exceptions
1. Checked exceptions
The exceptions which are identified by java compiler.
Ex: InterruptedException
FileNotFound
IOException etc...

2. Un-checked Exceptions
The exceptions which are not identified by java compiler.
Ex:
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException etc...
 */

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("program is started....");
		Scanner sc=new Scanner(System.in);

		//Example1
		/*System.out.println("Enter a number:"); ////enter 0 to get Exception
		int num=sc.nextInt();
		System.out.println(100/num);  //ArithmeticException /by 0
		*/

		//Example2
		/*int a[]=new int[5];

		System.out.println("Enter the position(0-4):"); //enter 5 to get Exception
		int pos=sc.nextInt();

		System.out.println("Enter a value:");
		int value=sc.nextInt();

		a[pos]=value;  //ArrayIndexOutOfBoundsException Index 5 out of bounds for length 5

		System.out.println(a[pos]);
		*/
		
		//Example3
		/*String s="welcome";          //String should be always in number to covert into integer
		int num=Integer.parseInt(s); //NumberFormatException
		System.out.println(num);
		*/
		
		//Example4
		String s=null;   //Cannot invoke "String.length()" because "s" is null
		System.out.println(s.length()); //NullPointerException
		
		

		System.out.println("Program is completed..");
		System.out.println("Program is exited..");

	}

}
