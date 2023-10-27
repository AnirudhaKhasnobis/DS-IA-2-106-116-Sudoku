import java.util.*;

public class BankAccount

{
    int deposit()

    {

    };

    int withdraw()

    {

    };

    public class SavingsAccount

    {
        int withdraw()

        {

        }
    }

}

public class Anirudha(String args[])

{
    public static void main()
    {

    }
}





class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() - 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance must be maintained.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500);
        account1.deposit(200);
        account1.withdraw(100);
        System.out.println("Account 1 Balance: $" + account1.getBalance());

        SavingsAccount account2 = new SavingsAccount(300);
        account2.deposit(150);
        account2.withdraw(50);
        account2.withdraw(200);
        System.out.println("Account 2 Balance: $" + account2.getBalance());
    }
}



