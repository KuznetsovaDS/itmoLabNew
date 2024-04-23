package itmo.lab6.task1_2;

public class BankWorker extends Person{

    String bankName;

    public BankWorker(String firstName, String lastName, String bankName){
        super(firstName,lastName);
        this.bankName = bankName;
    }
    @Override
    public void showPersonInfo(){
        System.out.println("Данные работника банка: " + firstName + lastName + bankName);
    }
    @Override
    public double calcCredit(double sum, double rate){
        return sum / 100 * rate;
    }
}
