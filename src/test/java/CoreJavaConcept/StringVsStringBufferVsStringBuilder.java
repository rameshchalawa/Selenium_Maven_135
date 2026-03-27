package CoreJavaConcept;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//String - immutable
        String s="welcome";
        s.concat("to java"); //concat() method is used to concatenate two strings, but it does not change the original string, it returns a new string
        System.out.println(s); //welcome // immutable, cannot change original value
        

        //StringBuffer - mutable
        /*StringBuffer s=new StringBuffer("welcome");
        s.append(" to java");
        System.out.println(s); //welcome to java // mutable, we can change original value
        */

        //StringBuilder - mutable
        //StringBuilder s=new StringBuilder("welcome");
        //s.append(" to java");
        //System.out.println(s); //welcome to java // mutable, we can change original value

	}

}
