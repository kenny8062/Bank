import java.util.Scanner;
public class CheckingAccount extends Bank1{
	private double credit_limit;
	private double interest;
	private double loan_interest;
	public CheckingAccount(double account,double credit_limit,double interest,double loan_interest){
		super(account);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	@Override public double debit(){
			super.debit();
			if(getaccount()<0){
				if(getaccount()<credit_limit){
					System.out.println("대출한도를 초과했습니다");
					setaccount(getmuch());
				}
				else{
					System.out.println("대출받으셨습니다");
				}
			}	
		return 0;
	}
	public void nextMonth(){
		if(getaccount()<0){
			setaccount(getaccount()*interest);
		}
		else{
			setaccount(getaccount()*loan_interest);
		}
	}
}
