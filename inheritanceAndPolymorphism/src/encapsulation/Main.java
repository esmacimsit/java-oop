package encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        bankAccount.withdraw(30);
        System.out.println(bankAccount.getBalance());
    }
}
