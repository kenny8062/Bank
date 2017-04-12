import java.util.Scanner;
public class CheckingAccount extends Account{
	private double credit_limit;    //대출 한도
	private double interest;       //이자율
	private double loan_interest;   //대출 이자율
	public CheckingAccount(double account,double credit_limit,double interest,double loan_interest){
		super(account);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	@Override public void debit(double mount)throws Exception{
			if(mount<0){
				throw new Exception ("양수를 입력하세요");
			}
			if(mount>getaccount() + credit_limit){
				throw new Exception("한도초과");
			}
			else{
				super.debit(mount);
				System.out.println("대출받으셨습니다");
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
