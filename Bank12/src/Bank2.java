import java.util.Scanner;

public class Bank2 {
	public static void main(String[] args){
		CheckingAccount account1=new CheckingAccount(100.0,1000.0,0.1,0.07);
		CheckingAccount account2=new CheckingAccount(100.0,1000.0,0.1,0.07);
		System.out.println("1.account1���� 2.account2���� 3.��� 4.����");
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		while(true){
			if(num1==1){
				System.out.println("1.�Ա� 2.���");
				int num2=input.nextInt();
				if(num2==2){
					account1.debit();
				}
				if(num2==1){
					account1.credit();
				}
			}
			else if(num1==2){
				System.out.println("1.�Ա� 2.���");
				int num2=input.nextInt();
				if(num2==2){
					account2.debit();
				}
				if(num2==1){
					account2.credit();
				}
				
			}
			else if(num1==3){
				System.out.printf("account1 :%f account2:%f\n",account1.getaccount(),account2.getaccount());
			}
			else if(num1==4){
				break;
			}
			if(num1==4)
				break;
			System.out.println("1.�Ѵ��� ��������?2.����������?");
			int num4=input.nextInt();
			if(num4==1){
				account1.nextMonth();
			}
			System.out.println("1.account1���� 2.account2���� 3.��� 4.����");
			num1=input.nextInt();
		}
		
	}
}