package CodingRound;

import java.util.Random;

class Bank extends BankOperations{

    void menu(){

        System.out.println("Please Select an option :"+
                            "\n0 for Exit"+
                            "\n1 to Create New Account" +
                            "\n2 to Deposit Money" +
                            "\n3 to Withdraw Money" +
                            "\n4 to  Display Account Details");
        int option = sc.nextInt();
        BankOperations  bankOperations = new BankOperations();
        switch (option) {
            case 0 :
                  bankOperations.exit();
                  break;
            case 1:
                bankOperations.addAccount();
                break;
            case 2:
                bankOperations.depositAmount();
                break;
            case 3:
                bankOperations.withdraw();
                break;
            case 4:
                bankOperations.displayAccountDetails();
                break;
        }
    }
}

public class Driver{
    public static void main(String[] args) {
    Bank bank = new Bank();
    bank.menu();
    }
}
