import java.util.Scanner;
public class CheckingAccount extends Account implements Valuable{
	private double credit_limit;    //대출 한도
	private double interest;       //이자율
	private double loan_interest;   //대출 이자율
	public CheckingAccount(double account,double credit_limit,double interest,double loan_interest){
		super(account);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	@Override public double EstimateValue(int month){
		setaccount(getaccount()*(Math.pow((1+interest),month)));
		return getaccount();
	}
	@Override public double debit(double mount){
			super.debit(mount);
			if(getaccount()<0){
				if(getaccount()<-credit_limit){
					System.out.println("대출한도를 초과했습니다");
				}
				else{
					System.out.println("대출받으셨습니다");
				}
			}	
		return 0;
	}
	@Override public void passTime(int month){
		if(getaccount()>0){
			setaccount(getaccount()*(Math.pow((1+interest),month)));
		}
		else{
			setaccount(getaccount()*(Math.pow((1+loan_interest),month)));
		}
	}
	@Override public double getWithdrawableAccount(){
		if(getaccount()<0){
			if(credit_limit+getaccount()<0){
				return 0;
			}
			else {
				return getaccount()+credit_limit;
			}
		}
		else{
			return getaccount()+credit_limit;
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
