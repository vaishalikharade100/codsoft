
/*ATM INTERFACE

1.Create a class to represent the ATM machine.

2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.

3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().

4. Create a class to represent the user's bank account, which stores the account balance.

5. Connect the ATM class with the user's bank account class to access and modify the account
balance.

6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).

7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.*/


package code_soft;

import java.util.*;

public class task3 {
public static void main( String args[] ) {
//declare and initialize balance, withdraw, and deposit
int balance = 50000;
int withdraw, deposit;
//create scanner class object to get choice of user
Scanner sc = new Scanner(System.in);
while(true)
{
System.out.println( "Welcome to ATM ... " );
System.out.println( "Select 1 for Withdraw" );
System.out.println( "Select 2 for Deposit" );
System.out.println( "Select 3 for Check Balance" );
System.out.println( "Select 4 for EXIT" );
System.out.print( "Select the appropriate options you want to perform:" );
//get the user selected option
int op = sc.nextInt( );
switch( op )
{
case 1: System.out.print( "Enter the amount to be withdrawn :" );
// accept the withdraw amount from the user
withdraw = sc.nextInt();
//check whether the balance is greater than or equal to the withdrawal amount
withdraw( balance, withdraw);
break;
case 2: System.out.print( "Enter the amount to be deposited :" );
//accept the deposit amount from the user
deposit = sc.nextInt();
// call the function and add the deposit amount to the total balance
deposit( balance, deposit );
break;
case 3:
// printing the total balance of the user
printBalance( balance );
System.out.println(" ");
break;
case 4:
// exit from the menu
System.exit( 0 );
}
}
}
// function to print the current balance in an account
public static void printBalance(int balance)
{
System.out.println(" The Current Balance : " + balance);
System.out.println();
}
// The function to Withdraw an amount and update the balance
public static int withdraw(int balance, int withdrawAmount)
{
System.out.println( "Withdrawn Operation :" );
System.out.println("The withdrawing Amount is : " + withdrawAmount);
if (balance >= withdrawAmount) {
balance = balance - withdrawAmount;
System.out.println( "Please collect your money and remove the card" );
printBalance( balance );
}
else {
System.out.println( "Sorry! the balanace is insufficient." );
System.out.println( );
}
return balance;
}
// The function to deposit an amount and update the balance
public static int deposit(int balance, int depositAmount)
{
System.out.println( "Deposit Operation :" );
System.out.println(" The depositing amount is : " + depositAmount);
balance = balance + depositAmount;
System.out.println( "Your Money has been successfully deposited" );
printBalance(balance);
return balance;
}
}

/* OUTPUT:
Welcome to ATM ... 
Select 1 for Withdraw
Select 2 for Deposit
Select 3 for Check Balance
Select 4 for EXIT
Select the appropriate options you want to perform:1
Enter the amount to be withdrawn :10000
Withdrawn Operation :
The withdrawing Amount is : 10000
Please collect your money and remove the card
The Current Balance : 40000

Welcome to ATM ... 
Select 1 for Withdraw
Select 2 for Deposit
Select 3 for Check Balance
Select 4 for EXIT
Select the appropriate options you want to perform:2
Enter the amount to be deposited :5000
Deposit Operation :
The depositing amount is : 5000
Your Money has been successfully deposited
The Current Balance : 55000

Welcome to ATM ... 
Select 1 for Withdraw
Select 2 for Deposit
Select 3 for Check Balance
Select 4 for EXIT
Select the appropriate options you want to perform:3
The Current Balance : 50000


Welcome to ATM ... 
Select 1 for Withdraw
Select 2 for Deposit
Select 3 for Check Balance
Select 4 for EXIT
Select the appropriate options you want to perform:4
*/

