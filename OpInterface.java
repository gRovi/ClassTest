import java.util.Scanner;
class OpInterface
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		BankAccounts data = new BankAccounts();

		System.out.println("Enter 1 to make a deposit\n" + "Enter 2 to make a withdrawal\n" + "Enter 3 to make a transfer\n" );

		double newop = input.nextDouble();
		while(input != null)
		{
			if(newop ==1)
			{
				data.deposit();
				break;
			}
			if (newop == 2)
			{
				data.withdrawal();
				break;
			}
			if (newop == 3)
			{
				data.transfer();
				break;
			}
		}
	}
		
}