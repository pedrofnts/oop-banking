package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there a initial deposit? (y/n)");
        String validator = sc.nextLine();
        double balance = 0;

        if (validator.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
        }
        Account account = new Account(number, name, balance);

        System.out.println("Account data:");
        System.out.println("Account " + account.toString());

        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble();
        account.deposit(balance);
        System.out.println("Updated account data: " + account.toString());

        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();
        account.withdraw(balance);
        System.out.println("Updated account data: " + account.toString());

        sc.close();

    }


}
