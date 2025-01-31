package co.in.inheritance;

public class Businessman implements Richman {
	public int amount =2000;
	

	@Override
	public void donating(int i) {
		// TODO Auto-generated method stub
		System.out.println("Total amount of bussiness man"+amount);
		System.out.println("Donation Amount of businessman"+i);
		int a= amount - i;
		System.out.println("Remain Amount After Business Docation"+a);
		
	}

}
