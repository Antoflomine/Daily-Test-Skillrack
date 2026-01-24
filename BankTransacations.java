import java.util.*;

interface Transaction {
    void withdraw(int amt);
    void deposit(int amt);
    int viewBalance();
}

class BankAccount implements Transaction {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(int amt) {
        if (amt > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amt;
        }
    }

    @Override
    public void deposit(int amt) {
        balance += amt;
    }

    @Override
    public int viewBalance() {
        return balance;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialBalance = sc.nextInt();
        Transaction account = new BankAccount(initialBalance); // Fixed instantiation

        int N = sc.nextInt();
        for (int ctr = 1; ctr <= N; ctr++) {
            int amt = sc.nextInt();
            if (amt > 0) {
                account.deposit(amt);
            } else {
                account.withdraw(-amt);
            }
            System.out.println(account.viewBalance());
        }
        sc.close();
    }
}
