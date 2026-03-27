package CoreJavaConcept;

/*
Method overriding - when a child class has the same method as declared in the parent class, it is called method overriding. 
It is used to provide specific implementation of a method which is already provided by its parent class. 
The implementation in the child class overrides the implementation in the parent class.
 */
   class Bank {
    double roi() {
        return 0;
    }
}

   class ICICI extends Bank {
    double roi() {
        return 10.5;
    }
}

   class SBI extends Bank {
    double roi() {
        return 11.5;
    }
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		ICICI ic=new ICICI();
        System.out.println(ic.roi());
        
        SBI sb=new SBI();
        System.out.println(sb.roi());

	}

}
