package CoreJavaConcept;

/*
wrapping up of data and methods in to single unit(class)
1. All variables should be private
2. for every variable there should be 2 methods( get & Set)
3. variables can be operated only through methods.
*/

public class Encapsulation {
	
	 private int accno;   //variable should be private
	 private String name;
	 private double amount;
	 
     //To generate getter and setters automatically go to Source->Generate Getters and Setters
	 public int getAccno() {
		return accno;
	 }

	 public void setAccno(int accno) {
		 this.accno = accno;  //this keyword represent class variable
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public double getAmount() {
		 return amount;
	 }

	 public void setAmount(double amount) {
		 this.amount = amount;
	 }

	public static void main(String[] args) {
		
		Encapsulation acc=new Encapsulation();
		acc.setAccno(101);
		acc.setAmount(56000);
		acc.setName("john");

		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());

	}

}
