import java.util.Scanner;
public class CheckingAccount extends Account{
	private double credit_limit;    //���� �ѵ�
	private double interest;       //������
	private double loan_interest;   //���� ������
	public CheckingAccount(double account,double credit_limit,double interest,double loan_interest){
		super(account);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	@Override public void debit(double mount)throws Exception{
			if(mount<0){
				throw new Exception ("����� �Է��ϼ���");
			}
			if(mount>getaccount() + credit_limit){
				throw new Exception("�ѵ��ʰ�");
			}
			else{
				super.debit(mount);
				System.out.println("��������̽��ϴ�");
			}
			
	}
	@Override public void passTime(int month){
		if(getaccount()>0){
			setaccount(getaccount()*(Math.pow((1+interest),month)));
		}
		else{
			setaccount(getaccount()*(Math.pow((1+loan_interest),month)));
		}
	}
	public boolean isBankrupted(){
		if(getaccount()<-credit_limit)
			return true;
		else{
			return false;
			}
	}
	public String toString(){
		return String.format("CheckingAccount_Balance:100.00");
	}

}
