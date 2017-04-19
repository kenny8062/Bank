import java.util.Scanner;
public class CheckingAccount extends Account implements Valuable{
	private double credit_limit;    //���� �ѵ�
	private double interest;       //������
	private double loan_interest;   //���� ������
	public CheckingAccount(double account,double credit_limit,double interest,double loan_interest){
		super(account);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	@Override public double EstimateValue(int month){
		 		return getBalance()*(Math.pow((1+interest),month));
		 	}

	@Override public double EstimateValue(){
		 		return getBalance()*(Math.pow((1+interest),1));
		 	}
	@Override public double getWithdrawableAccount(){
		 		if(getBalance()<0){
		 			if(credit_limit+getBalance()<0){
		 				return 0;
		 			}
		 			else {
		 				return getBalance()+credit_limit;
		 			}
		 		}
		 		else{
		 			return getBalance()+credit_limit;
		 		}
		 	}
	@Override public void debit(double mount)throws Exception{
			if(mount<0){
				throw new Exception ("����� �Է��ϼ���");
			}
			if(mount>getBalance() + credit_limit){
				throw new Exception("�ѵ��ʰ�");
			}
			else{
				super.debit(mount);
				System.out.println("��������̽��ϴ�");
			}
			
	}
	@Override public void passTime(int month){
		if(getBalance()>0){
			setaccount(getBalance()*(Math.pow((1+interest),month)));
		}
		else{
			setaccount(getBalance()*(Math.pow((1+loan_interest),month)));
		}
	}
	@Override public void passTime(){
		if(getBalance()>0){
			setaccount(getBalance()*(Math.pow((1+interest),1)));
		}
		else{
			setaccount(getBalance()*(Math.pow((1+loan_interest),1)));
		}
	}
	public boolean isBankrupted(){
		if(getBalance()<-credit_limit)
			return true;
		else{
			return false;
			}
	}
	public String toString(){
		return String.format("CheckingAccount_Balance:100.00");
	}

}
