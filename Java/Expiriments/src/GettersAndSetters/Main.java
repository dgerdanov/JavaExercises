package GettersAndSetters;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setId(1);
        bankAccount.deposit(-5);
        bankAccount.withdraw(5);

        System.out.printf("Account %s, balance %.2f", bankAccount, bankAccount.getBalance());
    }
}
