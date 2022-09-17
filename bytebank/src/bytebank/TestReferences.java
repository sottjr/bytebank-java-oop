package bytebank;

public class TestReferences {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 300;
		
		System.out.println("Balance of first Account: U$ " + firstAccount.balance);
	
		Account secondAccount = firstAccount;
		
		System.out.println("Balance of second Account: U$ " + secondAccount.balance);
	}
}
 