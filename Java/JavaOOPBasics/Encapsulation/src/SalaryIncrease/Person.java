package SalaryIncrease;

public class Person {


    private String _firstName;
    private String _lastName;
    private int _age;
    private Double _salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._age = age;
        this._salary = salary;
    }

    public void increaseSalary(int bonus) {
        if (this._age > 30) {
            this._salary += this._salary * bonus / 100;
        } else {
            this._salary += this._salary * bonus / 200;
        }
    }

    public void setSalary (double salary) {
        this._salary = salary;
    }

    public String getFirstName() {
        return this._firstName;
    }

    public Double getSalary() {
        return this._salary;
    }

    public int getAge() {
        return this._age;
    }

    @Override
    public String toString() {
        return this._firstName + " " + this._lastName + " get " + this._salary + " leva";
    }
}