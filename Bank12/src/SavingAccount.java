import java.util.Scanner;

public class SavingAccount extends Account implements Valuable{
	private double interest;
	private int count=0;
	public SavingAccount(double account,double interest){
		super(account);
		this.interest=interest;
	}

	@Override public double EstimateValue(int month){
		setaccount(getaccount()*(Math.pow((1+interest),month)));
		return getaccount();
	}
	@Override public double debit(double money){
		if(count>11){
			setaccount(getaccount()-money);
			return 0;
		}else{
			System.out.println("���� ����� �� �����ϴ�.");
		
			return 0;
		}
	}
	@Override public void passTime(int month){
		if(count<12){
			count+=month;
			setaccount(getaccount()*(Math.pow((1+interest),month)));
		}
		else{
			System.out.println("1���� �������ϴ�");
		}
	}
	@Override public double getWithdrawableAccount(){
		return getaccount();
	}

	public String toString(){
		return String.format("SavingAccount_Balance:100.00");
	}
}
