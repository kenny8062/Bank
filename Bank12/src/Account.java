import java.util.Scanner;
import java.util.InputMismatchException;
public abstract class Account implements Valuable{
	private double balance;
	private double much;
	public double getBalance(){
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
	public double credit(int much){
		balance +=much;
		return balance;
	}
	public Account(double account1){
		balance=account1;
	}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int month);
	public abstract void passTime();
	public abstract double EstimateValue(int month);
	public abstract double EstimateValue();
}