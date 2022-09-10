package com.MyGame.ATM;

public class ATM {
    public ATM(){
        System.out.println("Enter you pin: ");
    }

    public void menu(){
        System.out.println("\n1. Withdraw");
        System.out.println("\n2. Deposit");
        System.out.println("\n3. Balance inquiry");
        System.out.println("\n4. Exit");
    }

    public void withdrawMenu(){
        System.out.println("Enter an amount to withdraw");
    }

    public void depositMenu(){
        System.out.println("Enter an amount to deposit ");
    }

    public void balanceMenu(double balance){
        System.out.printf("The balance is $%.2f ", balance);
    }

    public void invalidMessageMenu(){
        System.out.println("Invalid option. Try again. ");
    }

    public void exitMenu(){
        System.out.println("\nThanks for banking with us");
    }
}
