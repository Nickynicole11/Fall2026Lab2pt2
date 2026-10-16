
/**
 * Program simulates a savings account.
 *
 * @author Nicole Rodriguez
 * @version v1.0
 * @since 10/15/2026
 */
public class BankAccount
{
   private double balance;
   private double deposit;
   private double withdraw;
   private double interest;
   private double monthlyIntRate;
   
   /**
    * Create a bank account with a default monthly interest rate of 4.4%
    */
   public BankAccount()
   {
       balance = 0.0;
       deposit = 0.0;
       withdraw = 0.0;
       interest = 0.0;
       monthlyIntRate = 0.044/12;
   }
   /**
    * Creates a bank account with an integer starting balance
    * 
    * @param inBalance the starting balance
    * @param intRate the anual rate as percentage
    */
   public BankAccount(double inBalance, double intRate)
   {
       balance = inBalance;
       deposit = 0.0;
       withdraw = 0.0;
       interest = 0.0;
       monthlyIntRate = intRate/100/12;
   }
   /**
    * Add a deposit to the account
    * 
    * @param add the amount deposit
    */
   public void makeDeposit(double add)
   {
       balance += add;
       deposit += add;
   }
   /**
    * Adds a whole-dollar deposit to the account 
    * 
    * @param add the amount deposit
    */
   public void makeDeposit(int add)
   {
       balance += add;
       deposit += add;
   }
   /**
    * Withdraws money from the account 
    * 
    * @param sub the amount withdrawn
    */
   public void makeWithdraw(double sub)
   {
       balance -= sub;
       withdraw += sub;
   }
   /**
    * Withdraws a whole-dollar amount from the account
    * 
    * @param sub the amount withdrawn 
    */
   public void makeWithdraw(int sub)
   {
       balance -= sub;
       withdraw += sub;
   }
   /**
    * Calculates and add monthly interest if the balance is positive
    */
   public void calcInterest()
   {
       if (balance > 0)
       {
           double monthlyInterest = balance * monthlyIntRate;
           balance += monthlyInterest;
           interest += monthlyInterest;
       }
   }
   /**
    * returns the current account balance.
    * 
    * @return the current balance
    */
   public double getBalance()
   {
       return balance;
   }
   /**
    * returns the total deposits.
    * 
    * @return the total amount deposited
    */
   public double getDeposit()
   {
       return deposit;
   }
   /**
    * returns the total withdrawls.
    * 
    * @return the total amount withdrawn
    */
   public double getWithdraw()
   {
       return withdraw;
   }
   /**
    * returns the total interest earned.
    * 
    * @return the total interest earned
    */
   public double getInterest()
   {
       return interest;
   }
}