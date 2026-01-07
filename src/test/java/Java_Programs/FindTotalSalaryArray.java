package Java_Programs;

public class FindTotalSalaryArray {

	public static void main(String[] args) {
		
		int [] sal = {4000,5000,3000,2500,7200,6100};
		
		int totalsal = 0;
		
		for(int salary : sal) {
			
			totalsal = totalsal + salary;
		}
		System.out.println("This is total salary :"+totalsal);

	 }
        
}
