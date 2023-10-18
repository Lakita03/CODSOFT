import java.util.Scanner;
 class BankAccount
    {
       double balance;
       public void withdraw(double amount)
    {
            if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("You withdrawn the amount of :"+ amount);
            }
            else
            System.out.println("Insufficient Balance in your Account");
    }
     public void deposit(double amount)
    {
         System.out.println("Your deposited amount is : "+ amount);
         balance += amount;
         System.out.println("You deposited the cash of : "+ amount);
    }
    public double bankBalance()
    {
      return balance;
    } 
    }
public class ATM
{
    public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("**************Welcome To The ATM**************");
    BankAccount b1=new BankAccount();
    while(true)
    {
    System.out.println("Choose the operation you want to perform");
    System.out.println("1)Withdraw \n2)Deposit \n3)Bank Balance \n4)Exit");
    int operation=sc.nextInt();
   switch(operation)
    {
        case 1:
        System.out.println("Enter the amount you want to Withdraw ");
        double money=sc.nextDouble();
        b1.withdraw(money);
        break;
       case 2:
        System.out.println("Enter the amount you want to Deposit ");
        double deposited=sc.nextDouble();
        b1.deposit(deposited);
        break;
        case 3:
        double balance=b1.bankBalance();
        System.out.println("Your Bank Balance is: "+ balance);
        break;
         case 4 :
        System.out.println("THANK YOU VISIT AGAIN !!!");
        System.exit(0);
        break;
        default:
        System.out.println("Invalid Choice");
    } 
  }
  }   
}
