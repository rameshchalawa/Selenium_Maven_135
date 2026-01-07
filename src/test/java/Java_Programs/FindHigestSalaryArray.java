package Java_Programs;

public class FindHigestSalaryArray {

	public static void main(String[] args) {
		
		int [] sal = {4000,5000,3000,2500,7200,6100};
		
		int maxsalary = 0;
		
		for(int salary : sal) {
			
			if(salary > maxsalary) {
				maxsalary = salary;
			}
		}
        System.out.println("Higest Salary :"+maxsalary);
	}

}
