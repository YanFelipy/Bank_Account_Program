package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;
import entities.exceptions.DomainException;
public class Program {

	public static void main(String[] args) throws DomainException{
	Locale.setDefault(Locale.US);
    
	Scanner sc = new Scanner(System.in);
	try {
	System.out.println("Enter account data: ");
    System.out.print("Number: ");
    Integer number = sc.nextInt();    
    System.out.print("Holder: ");
    sc.nextLine();
    String holder = sc.nextLine();
    System.out.print("Initital Balance: ");
    double balance = sc.nextDouble();
    System.out.print("Whitdraw Limit: ");
    double withdrawLimit = sc.nextDouble();
    Account acc = new Account(number, holder, balance, withdrawLimit);
    
    System.out.println();
    System.out.print("Enter amount for withdraw: ");
    double amount = sc.nextDouble();
    acc.whitdrawBalance(amount);
    
    System.out.printf("New Balance: %.2f", acc.getBalance());
    }
   catch (DomainException e) {
    	System.out.println(e.getMessage());
    }
	
    sc.close();
	}
}
