import java.util.Scanner;
public abstract class Account {
	private double account;
	private double much;
	public double getaccount(){
		return account;
	}
	public double getmuch(){
		return much;
	}
	protected void setaccount(double account){
		this.account=account;
	}

	public double debit(double amount){
		account -=amount;
		if(account>=0){
				return 0;
		}
		return 0;
	}	  
	public double credit(){
		System.out.print("How much");
		Scanner input3=new Scanner(System.in);
		much=input3.nextInt();
		account +=much;
		return account;

	}
	public Account(double account1){
		account=account1;
	}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int month);

}