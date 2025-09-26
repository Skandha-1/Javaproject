package programs;
class ATM{
	private double balance;
	public ATM(double initialBalance) {
		this.balance=initialBalance;
	}
	public void withdraw(double amount) {
		if (amount >0 && amount<=balance) {
			processWithdrawal(amount);
		}
		else {
			System.out.println("Invalid withdrawl amount");
		}
	}

	public double getBalance() {
		return balance;
	}
	private void processWithdrawal(double amount) {
		balance-=amount;
		System.out.println(""+amount+" withdrawn Successfully");
		
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
public class MethodExample {

	public static void main(String[] args) {
		ATM a=new ATM(20000);
		a.withdraw(2000);
		a.setBalance(10000);
		
		System.out.println("current Balanace: "+a.getBalance());

	}

}
