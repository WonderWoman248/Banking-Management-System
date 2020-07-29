package BankingApp;
import java.util.*;

public class BankingApplication {

    public static void main(String[] args) {
        BankAccount ba=new BankAccount("Miss Prashansa","P3076");
        ba.showMenu();

    }
}

class BankAccount {
    int balance;
    int prevTransaction;
    String userName;
    String userId;

    BankAccount(String userName, String userId){
       this. userName=userName;
        this.userId=userId;
    }

    void deposit(int amount) {

        if (amount != 0) {
            balance += amount;
            prevTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            prevTransaction = -amount;
        }

    }

    void getPrevTransaction() {
        if(prevTransaction>0){
            System.out.println("deposited "+prevTransaction);
        }

        else if(prevTransaction<0){
            System.out.println("withdrawn "+Math.abs(prevTransaction));
        }

        else{
            System.out.println("no transaction is done");
        }
    }

    void showMenu(){
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome "+userName);
        System.out.println("your id is: "+ userId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do{
            System.out.println("---------------------------------------------------");
            System.out.println("Enter an option");
            System.out.println("---------------------------------------------------");
            option=sc.next().charAt(0);
            System.out.println("\n");
            switch (option){
                case 'A':
                    System.out.println("---------------------------------------------------");
                    System.out.println("Current balance is: "+ balance);
                    System.out.println("---------------------------------------------------");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("---------------------------------------------------");
                    System.out.println("enter the amount");
                    System.out.println("---------------------------------------------------");
                    int amount=sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C' :
                    System.out.println("---------------------------------------------------");
                    System.out.println("enter the amount");
                    System.out.println("---------------------------------------------------");
                    int amount2=sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D' :
                    System.out.println("---------------------------------------------------");
                    getPrevTransaction();
                    System.out.println("---------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                default:
                    System.out.println("Please make a valid choice");


            }
        }
        while(option!='E');

        System.out.println("Thank you :)");



    }
}