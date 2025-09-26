package Assignement;

class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


abstract class BankService {
    public abstract void provideService(Account account);
    public void printWelcomeMessage() {
        System.out.println("Welcome to our Bank!");
    }
}


class LoanService extends BankService {
    @Override
    public void provideService(Account account) {
        System.out.println("Loan service provided for " + account.getAccountHolder());
    }
}

class InsuranceService extends BankService {
    @Override
    public void provideService(Account account) {
        System.out.println("Insurance service provided for " + account.getAccountHolder());
    }
}


class Transaction {
    public void transfer(Account from, Account to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

    public void transfer(Account to, double amount) {
        System.out.println("Cash deposit into " + to.getAccountHolder() + "'s account.");
        to.deposit(amount);
    }
}


public class BankingSystem {
    public static void main(String[] args) {
      
        Account acc1 = new Account("Alice", 5000);
        Account acc2 = new Account("Bob", 3000);

      
        System.out.println(acc1.getAccountHolder() + "'s balance: " + acc1.getBalance());

       
        BankService service;
        service = new LoanService();
        service.printWelcomeMessage();
        service.provideService(acc1);

        service = new InsuranceService();
        service.provideService(acc2);

        Transaction txn = new Transaction();
        txn.transfer(acc1, acc2, 2000); // transfer between accounts
        txn.transfer(acc2, 1500); // deposit into account
    }
}
