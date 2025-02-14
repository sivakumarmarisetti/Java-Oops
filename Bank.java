import java.util.Scanner;

public class Bank {
	static int currentBalance = 1000;
	public int displayBalance() {
		return currentBalance;
	}
	public void deposit(int amount) {
		System.out.println("Successfully deposited: "+amount);
		currentBalance+=amount;
		System.out.println("Current Balance: "+currentBalance);
	}
	public void withdraw(int amount) {
		if(amount>currentBalance) {
			System.out.println("Insufficent funds!");
			return;
		}
		else {
			System.out.println(amount+" withdrawn successfully!");
			currentBalance-=amount;
			System.out.println("CurrentBalance: "+currentBalance);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		boolean exit = false; // ✅ Exit condition

        while (!exit) {
            System.out.println("\n===== Welcome to My Bank! =====");
            System.out.println("Choose an option:");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            if (!sc.hasNextInt()) {  // ✅ Check if input is an integer
                System.out.println("Invalid input! Please enter a number.");
                sc.next();  // Consume invalid input
                continue;
            }
		    int key = sc.nextInt();
			switch (key) {
			case 1: System.out.println("current Balance: "+bank.displayBalance());
				break;
			case 2: 
				System.out.print("Enter amount: ");
				int amount = sc.nextInt();
				bank.deposit(amount);
				break;
			case 3:
				System.out.println("Enter amount: ");
				int withdrawAmount = sc.nextInt();
				bank.withdraw(withdrawAmount);
			}
			if (!exit) {
                String choice;
                do {
                    System.out.print("\nDo you want to continue? (y/n): ");
                    choice = sc.next().trim().toLowerCase();
                    if (!choice.equals("y") && !choice.equals("n")) {
                        System.out.println("Invalid input! Please enter 'y' or 'n'.");
                    }
                } while (!choice.equals("y") && !choice.equals("n"));  // Keep asking until valid input

                if (choice.equals("n")) {
                    exit = true;
                    System.out.println("Thank you for banking with us! Exiting...");
                }
            }
		}
		sc.close();
	}

}
