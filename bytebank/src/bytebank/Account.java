package bytebank;

public class Account {
	double balance;
	int agency;
	int number;
	String name;
	
	public void deposit(double value) {
		this.balance = this.balance + value;
	}
}
