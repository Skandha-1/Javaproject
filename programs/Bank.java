package programs;
class canarabank{
	public int deposite(int dep) {
		return dep;
	}
	int withdrawl(int draw) {
		return draw;
		
	}
	int balance(int bal) {
		return bal;
	}
	int totalbalance(int dep,int draw) {
		return dep-draw;
	}
}
public class Bank {

	public static void main(String[] args) {
		canarabank amount=new canarabank();
       int a= amount.deposite(12000);
        int b=amount.withdrawl(500);
        int total = amount.totalbalance(a, b);
        System.out.println(a);
        System.out.println(b);
        System.out.println("Total Balance: " + total);
	}

}
