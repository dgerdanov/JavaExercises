package GettersAndSetters;

public class BankAccount {

    private int id;
    private double balance;



    public void setId(int id) {
        this.id= id;
    }
    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount){
       if (amount < 0) {

            System.out.println("Insert valid  quantity");

        }
        this.balance += amount;

    }

    public void withdraw(double amount){

        this.balance -= amount;

    }

    @Override

    public String toString(){
        return "ID" + this.id;
    }
}
