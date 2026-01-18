package CoreJavaConcept;
/*
 Scenario 1 -- String ----> int, double, boolean 
1. String---->int        Integer.parseInt(String value)
2. String---->double     Double.parseDouble(String value)
3. String---->boolean    Boolean.parseBoolean(String value)
4. String -->char        Not possible

Scenario 2 --- int,double,boolean,char------>String
String.valueOf() → convert all primitive data types into string format.
 */

public class WrapperClassForDataConversionMethods {

	public static void main(String[] args) {
		
		// String-->int
        //String s="welcome";   // cannot convert to int
		
        /*String s1="10";
        String s2="20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
        */
		
        //String-->double
        String s1="10.5";
        String s2="20.0";
        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
        
      //String---->boolean
      //String s="true";  // other than true, if you pass any string that will return false. 
      //System.out.println(Boolean.parseBoolean(s));

      //int, double, bool, char ----->String
      int a=10;
      double d=10.5;
      char c='A';
      boolean bool=true;

      String s=String.valueOf(a);
      System.out.println(s);

      s=String.valueOf(d);
      System.out.println(s);

      s=String.valueOf(c);
      System.out.println(s);

      s=String.valueOf(bool);
      System.out.println(s);

	}

}
