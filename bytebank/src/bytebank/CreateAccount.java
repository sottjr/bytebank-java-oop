package bytebank;

public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 200;
		System.out.println(firstAccount.balance);

		firstAccount.balance += 100;
		System.out.println(firstAccount.balance);

		Account secondAccount = new Account();
		secondAccount.balance = 50;
		System.out.println(secondAccount.balance);

		System.out.println("The first account have a balance of U$ " + firstAccount.balance);
		System.out.println("The first account have a balance of U$ " + secondAccount.balance);
		
		System.out.println(firstAccount);
		
	}

}
