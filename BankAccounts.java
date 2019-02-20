import java.util.Scanner;

class BankAccounts{
	Scanner input = new Scanner(System.in);
		
	public String name;
	public double init_bal = 5400;
	public double amount;
	public int acc_no = 1770;
	public double init_bal1,init_bal2,init_bal3;
 
			public void deposit(){
					System.out.print("Enter Amount:");
					amount = input.nextDouble();
				if (amount > 0){
					System.out.println(amount + "\t has been credited to your account");
					init_bal1 = init_bal + amount;
					System.out.println("Your new balance is:\t" + init_bal1);
					}
				}
			public void withdrawal()
			{
				System.out.print("Enter Amount");
				amount = input.nextDouble();
				if (amount > init_bal)
				{
					System.out.println("You have issufficient Balance");
				}
			else{
					init_bal2 = init_bal - amount;
					System.out.println("Your Remaining Balance is:\t" + init_bal2);
				}
			}
		public void transfer()
		{
			System.out.println("Enter Account Name:");
			String name = input.nextLine();

			System.out.println("Enter Account No.:");
			double acc_no = input.nextDouble();

			System.out.println("Enter Amount:");
			double amount = input.nextDouble();

			if (amount > init_bal)
			{
				System.out.print("Transaction failure:Insufficient Balance");
			}
			else{
				System.out.print(amount + "\t has been debited from your Account");
				init_bal3 = init_bal - amount;
				System.out.println("Your current Balance is:\t" + init_bal3);
			}
		}
		/*public void createAcc()
		
		
			{
				
		
	}*/
}



