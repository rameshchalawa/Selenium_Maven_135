package CoreJavaConcept;

/*
 mutable vs immutable
 mutable- can change
 immutable - cannot change
 String is immutable - we cannot change the value of string once it is created. 
 If we try to change the value of string, it will create a new string object in memory and assign the new value to that object.
 */

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		//mutable- can change
        /*int a[]= {20,10,40,50,30};
        System.out.println(Arrays.toString(a)); 
        Arrays.sort(a); //mutable - we can change 
        System.out.println(Arrays.toString(a));
        */

        //immutable
        String s=new String("welcome");
        System.out.println(s); // welcome

        s.concat("to java");
        System.out.println(s); //welcome  ---> immutable - we cannot change
        

	}

}
