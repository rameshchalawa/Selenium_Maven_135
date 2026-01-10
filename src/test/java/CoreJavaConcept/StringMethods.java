package CoreJavaConcept;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		//String s="welcome";
        //String s=new String("welcome");
        //System.out.println(s);

        //length() - returns length of a string(number of characters)
        String s="welcome";
        s.length();
        System.out.println(s.length()); //7
        System.out.println("welcome".length());//7
        
        //concat() - joining strings
        String s1="welcome";
        String s2=" to java";
        String s3=" automation";

        System.out.println(s1+s2); //welcome to java
        System.out.println(s1.concat(s2)); //welcome to java

        System.out.println(s1+s2+s3); //welcome to java automation
        System.out.println(s1.concat(s2).concat(s3)); //welcome to java automation
        System.out.println(s1.concat(s2+s3)); //welcome to java automation

        System.out.println("welcome"+" to java"); //welcome to java
        System.out.println("welcome".concat(" to java")); //welcome to java
        
        //trim() - remove spaces right and left side
        s=" welcome ";
        System.out.println(s); //print string along with spaces
        System.out.println("Before trimming:"+s.length());
        System.out.println(s.trim());
        System.out.println("After trimmed:"+s.trim().length());

        //charAt() - returns a character from a string based on index
        // index starts from 0
        s="welcome";
        System.out.println(s.charAt(3)); //c
        System.out.println(s.charAt(0)); //w
        

        //contains() - returns true/false
        //checks string is part of main string ot not
        System.out.println(s.contains("wel")); //true
        System.out.println(s.contains("come")); //true
        System.out.println(s.contains("Wel")); //false
        System.out.println(s.contains("COME")); //false
        System.out.println(s.contains("welme")); //false
        
        //ex2
        String name="John Kenedy";
        System.out.println(name.contains("john")); //false
        System.out.println(name.replace('J','j').contains("john")); //true
        System.out.println(name.toLowerCase().contains("john")); //true
        
        //equals() , equalsIgnoreCase() - compare strings
        s1="welcome";
        s2="welcome";

        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals("Welcome")); //false
        System.out.println(s1.equalsIgnoreCase("Welcome")); //true

        //replace() - replace single/multiple(sequence) of characters in a string
        s="welcome to selenium java selenium python selenium c#";
        System.out.println(s.replace('e','X')); //wXlcomX to sXlXnium java sXlXnium pythX
        System.out.println(s.replace("selenium", "playwright")); //welcome to playwright java playwright python playwright
        
        //ex1
        String amount="$15,20,55";
        System.out.println(amount.replace("$","")); //15,20,55
        System.out.println(amount.replace("$","").replace(",","")); //152055


        //substring()-extract substring from the main string
        //Starting index - 0
        //ending index start with - 1
        s="Selenium";
        System.out.println(s.substring(1, 5)); //elen
        System.out.println(s.substring(0,3)); //Sel


        //toUpperCase()  toLowerCase()
        s="Welcome";
        System.out.println(s.toUpperCase());  //WELCOME
        System.out.println(s.toLowerCase());  //welcome

        //split() -split the string into multiple parts based on delimiter
        //You cannot use the following characters as delimiters in the split() method 
        /*
         . (dot) 
         * (asterisk)
         + (plus sign)
         ? (question mark)
         ^ (caret)
         $ (dollar sign)
         | (vertical bar)
         ( and ) (parentheses)
         [ and ] (square brackets)
         { and } (curly brackets)
         
         */
        
        s="abc@gmail.com";

        String a[]=s.split("@");
        System.out.println(Arrays.toString(a));  //[abc, gmail.com]

        System.out.println(a[0]);  //abc
        System.out.println(a[1]);  //@gmail.com
        
        //ex2
        s="abc,123@xyz"; //abc 123 xyz
        String arr1[]=s.split(",");
        System.out.println(Arrays.toString(arr1)); //[abc, 123@xyz]

        String arr2[]=arr1[1].split("@");
        System.out.println(Arrays.toString(arr2)); //[123, xyz]
        System.out.println(arr1[0]); //abc
        System.out.println(arr2[0]); //123
        System.out.println(arr2[1]); //xyz
        
        //ex3 
        s="abc 123 zyz"; //here, used space as delimiter
        String ar[]=s.split(" ");
        System.out.println(Arrays.toString(ar)); //[abc, 123, zyz]

	}

}
