package itmo.lab6.task1_2;

abstract class Person implements OverPayment {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public abstract void showPersonInfo();
}
