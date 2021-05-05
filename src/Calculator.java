public class Calculator {
	int s_balance;
//	int deposit;
//	int payment;
	int judge;
	
	public void setBalance(int balance) {
		this.s_balance = balance;
	}
	
	public int deposit(int price) {
		this.s_balance += price;
		if (s_balance >= 1) {
			return this.judge = 0;
		} else {
			return this.judge = -1;
		}
	}
	
	public int payment(int price) {
		this.s_balance -= price;
		if (s_balance >= 1) {
			return this.judge = 0;
		} else {
			return this.judge = -1;
		}
	}
	
	public int getBalance() {
		if (this.judge == -1) {
			System.out.println("残高がありません。");
			this.s_balance = 0;
		}
		return this.s_balance;
	}
	
}
