package CodingRound;

import java.util.Scanner;

public class BankOperations {
String name,address,emailId;
long phoneNumber;
long accountNumber;
long balance;
Scanner sc = new Scanner(System.in);


    void addAccount(){
        System.out.println("Please Enter Your Name :");
        name = sc.nextLine();
        System.out.println("Please Enter Your Address :");
        address = sc.nextLine();
        System.out.println("Please Enter Your Email ID :");
        emailId = sc.nextLine();
        System.out.println("Please Enter Your Phone number :");
        phoneNumber = Long.parseLong(sc.nextLine());
        System.out.println("Please Enter an 12 Digit Account number of your choice : ");
        accountNumber = Long.parseLong(sc.nextLine());
        Bank bank = new Bank();
        bank.menu();
    }

    void depositAmount(){
        long validateAccountNumber;
        System.out.println("***********Depositing Money***********");
        System.out.println("Please Enter the Account Number:");
        validateAccountNumber = Long.parseLong(sc.nextLine());

        if (accountNumber == validateAccountNumber){
            System.out.println("Please enter the Deposit Amount :");
            int amount = sc.nextInt();
            balance = balance+amount;
            System.out.println("Your Updated Balance is : "+ balance);
        }
        else {
            System.out.println("Please enter correct account number");
        }
    }

    void withdraw() {
        long withdrawAmount = 0;
        System.out.println("Please Enter Amount you wish to Withdraw :");
        withdrawAmount = Long.parseLong(sc.nextLine());

            if (withdrawAmount <= balance)
                balance = balance - withdrawAmount;
            System.out.println("Amount Withdrawn");
            System.out.println("Updated Balance is  :" + balance);

    }

    void displayAccountDetails(){
        System.out.println("Account Number ==> " + accountNumber);
        System.out.println("Account Holder Name  ==> " + name);
        System.out.println("Your Registered Number ==> " + phoneNumber);
        System.out.println("Your Registered Address ==> " + name );
        System.out.println("Your Account Balance is ==> " + balance);

    }

    void exit(){
        System.out.println("Thankyou for Banking with us ");
    }


}
