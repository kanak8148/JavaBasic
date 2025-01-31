package co.in.inheritance;

public class TestRichmanInt {
	public static void main(String[]args) {
		Richman[]r = new Richman[2];
		r[0]=new Businessman();
		r[1]= new Student();
		
		r[0].donating(1000);
		r[1].donating(500);
	}

}
