package JavaProgram;

public class Program4_IncrementOperator {

	public static void main(String[] args) {
		
		// ++ is called increment operator

		//case 1
		/*int a=10;
		System.out.println(a);

		a++;	
		System.out.println(a);
		*/

		//case2 - post increment
		/*int a=10;
		int res=a++;
		System.out.println(res); //10
		System.out.println(a);//11
		*/

		//case 3 - pre increment
		int a=10;
		int res=++a;
		System.out.println(res); //11
		System.out.println(a); //11

	}

}
