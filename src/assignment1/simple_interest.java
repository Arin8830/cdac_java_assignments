package assignment1;

public class simple_interest {
	public static void main(String[] args) {
		int p=1200;
		int r=2;
		int t=10;
		
		int si=(p*r*t)/100;
		int amount=p + si;
		
		System.out.println("Simple interest:" + si);
		System.out.println("Amount:" + amount);
	}

}
