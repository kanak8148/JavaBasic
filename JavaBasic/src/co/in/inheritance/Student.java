package co.in.inheritance;

public class Student implements Richman {
	public int amount = 1000;

	@Override
	public void donating(int i) {
		// TODO Auto-generated method stub
		System.out.println("Total Amount of student"+amount);
		System.out.println("donation amount of Student"+i);
		int a=amount - i ;
		System.out.println("remain Amount Ater Student Donation"+a);
		
	}
	

}
