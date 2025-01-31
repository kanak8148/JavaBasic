package co.in.oops;

public class ConstructorCallingClass { 
	String fname ;
	String lname ;
	String address ;
	public ConstructorCallingClass(String fname , String lname) {
		this.fname =fname ;
		this.lname =lname;
		System.out.println(fname);
		System.out.println(lname);
		
		
	}
	public ConstructorCallingClass(String fname, String lname , String address) {
		this(fname , lname);
		this.address =address ;
		System.out.println(address);
	}

}
