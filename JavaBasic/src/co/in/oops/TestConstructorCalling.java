package co.in.oops;

public class TestConstructorCalling  extends ConstructorCallingClass{

	public TestConstructorCalling(String fname, String lname, String address) {
		super(fname, lname, address);
		// TODO Auto-generated constructor stub
	}
public static void main (String[]args) {
	TestConstructorCalling t = new TestConstructorCalling("kanak" ,"soni" ,"pune");
	//System.out.println(t);
}

	
}
