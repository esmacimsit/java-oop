package encapsulation;

public class BankAccount {
    private double balance = 100;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        } else{
            System.out.println("insufficient balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}
