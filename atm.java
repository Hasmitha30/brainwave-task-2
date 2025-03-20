import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0, depositAmount, withdrawAmount;
        int PIN = 1234;
        int enteredPIN;

        System.out.println("Welcome to ATM!");
        System.out.print("Enter your PIN: ");
        enteredPIN = scanner.nextInt();

        if (enteredPIN == PIN) {
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

  
