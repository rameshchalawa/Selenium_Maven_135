package Java_Programs;

public class Print_A1B2C3D4 {

	public static void main(String[] args) {
		
		// A1 B2 C3 D4
		
		char ch = 'A';
		int num = 1;
		
		for(int i=0 ; i<4;i++) {
			System.out.println(ch + "" + num);
			ch++; //Increments ch moves to next char in ASCII
			num++;
		}

	}

}
