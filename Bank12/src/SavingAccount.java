import java.util.Scanner;

public class SavingAccount extends Account{
	private double interest;
	private int count=0;
	public SavingAccount(double account,double interest){
		super(account);
		this.interest=interest;
	}
	@Override public void debit(double mount)throws Exception{
		if(mount<0){
			throw new Exception ("����� �Է��ϼ���");
		}else{
			if(count>11){
				if(getaccount()<mount){
					throw new Exception("�ѵ��ʰ�");
				}else{
					setaccount(getaccount()-mount);
				}
			}else{
				throw new Exception("��������Ҽ������ϴ�");
		
			
			}
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

	public String toString(){
		return String.format("SavingAccount_Balance:100.00");
	}
}
