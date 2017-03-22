import java.util.Scanner;
public class Bank1 {
	private double account;
	private double much;
	public double getaccount(){
		return account;
	}
	public double getmuch(){
		return much;
	}
	protected void setaccount(double account){
		this.account=account;
	}

	public double debit(){
		System.out.print("How much");
		Scanner input1=new Scanner(System.in);
		double much=input1.nextInt();
		account -=much;
		if(account>=0){
				return 0;
		}
		return 0;
	}	  
	public double credit(){
		System.out.print("How much");
		Scanner input3=new Scanner(System.in);
		much=input3.nextInt();
		account +=much;
		return account;

	}
	public Bank1(double account1){
		account=account1;
	}

}