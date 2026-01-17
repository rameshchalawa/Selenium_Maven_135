package CoreJavaConcept;

  class Test {
    final int x=100;
}

public class FinalKeywordForVariable {

	public static void main(String[] args) {
		
      Test t=new Test();
      //when variable is declared with final keyword we can not change the value of variable. variable value will be constant
      //t.x=200; 
      System.out.println(t.x);

	}

}
