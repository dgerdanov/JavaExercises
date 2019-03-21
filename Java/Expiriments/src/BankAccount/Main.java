package BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.id = 1;
        bankAccount.balance = 15;
        System.out.printf
                ("Account ID %d%nbalance %.2f",bankAccount.id, bankAccount.balance);
    }
}
