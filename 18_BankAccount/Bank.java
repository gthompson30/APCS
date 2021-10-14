public class Bank {
	public static void main( String[] args ) {
		BankAccount account = new BankAccount( "221202484", "nachos", "12345", "0000" );
		account.printInfo();
		System.out.println();
		
		account.deposit(432873.0);
		account.printInfo();
		System.out.println();
		
		account.withdraw(34732.5323);
		account.printInfo();
		System.out.println();
	}
}
