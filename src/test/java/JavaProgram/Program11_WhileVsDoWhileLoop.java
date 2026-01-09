package JavaProgram;

public class Program11_WhileVsDoWhileLoop {

	public static void main(String[] args) {
		
		/*int i=10;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }*/
        
        int i=10;
        do
        {
            System.out.println(i); //10 it will print value once then check condition. in this case value will print once even condition fails
            i++; 
        }while(i<=5);

	}

}
