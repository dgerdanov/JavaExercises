package pr07EqualityLogic;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }

        Person other = (Person)obj;
        if(this.name.equals(other.name) && this.age == other.age){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = 2;
        int nameHash = this.name.hashCode();
        result = 37 * result + nameHash;
        int ageHash = this.age;
        result = 37 * result + ageHash;
        return result;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.getName().compareTo(o.getName());
        if(result == 0){
            result = Integer.compare(this.getAge(),o.getAge());
        }

        return result;
    }
}
