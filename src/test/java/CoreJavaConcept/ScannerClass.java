package CoreJavaConcept;

import java.util.Scanner;

/*
Scanner class - used to take input from user at runtime.
To use Scanner class we need to import java.util.Scanner package.
1. nextInt() - to take integer input
2. nextDouble() - to take decimal input
3. next() - to take string input (it will take only single word)
4. nextLine() - to take string input (it will take multiple words)
*/

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

        /*System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Given number is: "+num);
        */

        /*System.out.println("Enter decimal number:");
        double num=sc.nextDouble();
        System.out.println("Given value is: "+num);
        */

        System.out.println("Enter your city:");
        String city=sc.next();
        System.out.println("Your city is:"+city);

	}

}
