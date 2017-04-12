import java.util.Scanner;
import java.util.InputMismatchException;
public abstract class Account{
	private double balance;
	private double much;
	public double getaccount(){
		return balance;
	}
	public double getmuch(){
		return much;
	}
	protected void setaccount(double account){
		this.balance=account;
	}

	public void debit(double amount) throws Exception{
		balance -=amount;
	}
	public double credit(){
		System.out.print("How much");
		Scanner input3=new Scanner(System.in);
		much=input3.nextInt();
		balance +=much;
		return balance;

	}
	public Account(double account1){
		balance=account1;
	}
	public void passTime(int month){};
}