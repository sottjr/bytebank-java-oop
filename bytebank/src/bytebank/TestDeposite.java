package bytebank;

public class TestDeposite {

	public static void main(String[] args) {
		Account userAccount = new Account();
		userAccount.balance = 100;
		userAccount.deposit(50);
		System.out.println(userAccount.balance);

	}

}
