package Java_Programs;

public class FindHowManyDuplicatesinArray {

	public static void main(String[] args) {
		
		 int a[] = {100, 200, 100, 300, 100, 400, 100, 200};
	     int num = 100;
	     int count = 0;

	     for (int value : a) {
	       if (value == num) {
	          count++; // 1 2 3 4
	        }
	       }

	     System.out.println(count);

	}

}
