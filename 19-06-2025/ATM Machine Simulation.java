

import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        while (true) {
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    balance += sc.nextInt();
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    int amt = sc.nextInt();
                    if (amt > balance)
                        System.out.println("Insufficient funds.");
                    else
                        balance -= amt;
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
