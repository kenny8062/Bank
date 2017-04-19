import java.util.Scanner;

public class SavingAccount extends Account implements Valuable{
	private double interest;
	private int count=0;
	public SavingAccount(double account,double interest){
		super(account);
		this.interest=interest;
	}
	@Override public double getWithdrawableAccount(){
		 		return getBalance();
		 	}
	@Override public double EstimateValue(int month){
		 		return getBalance()*(Math.pow((1+interest),month));
		 	}
	@Override public double EstimateValue(){
 		return getBalance()*(Math.pow((1+interest),1));
 	}
	@Override public void debit(double mount)throws Exception{
		if(mount<0){
			throw new Exception ("����� �Է��ϼ���");
		}else{
			if(count>11){
				if(getBalance()<mount){
					throw new Exception("�ѵ��ʰ�");
				}else{
					setaccount(getBalance()-mount);
				}
			}else{
				throw new Exception("��������Ҽ������ϴ�");
		
			
			}
		}
	}
	@Override public void passTime(){
		setaccount(getBalance()*(Math.pow((1+interest),1)));
	}
	@Override public void passTime(int month){
		if(count<12){
			count+=month;
			setaccount(getBalance()*(Math.pow((1+interest),month)));
		}
		else{
			System.out.println("1���� �������ϴ�");
		}
	}

	public String toString(){
		return String.format("SavingAccount_Balance:100.00");
	}
}
