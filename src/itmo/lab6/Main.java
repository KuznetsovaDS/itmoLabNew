package itmo.lab6;
import itmo.lab6.task1_2.Client;
import itmo.lab6.task1_2.BankWorker;
import itmo.lab6.task3.Truck;
import itmo.lab6.task4.ChildClass;
import itmo.lab6.task5.HeirClass;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Client client = new Client("Иван ", "Иванов ", "Тинькоф банк");
        BankWorker bankWorker = new BankWorker("Сергей ", "Сергеев ", "ВТБ");
        client.showPersonInfo();
        double clientCredit = client.calcCredit(100000, 15);
        System.out.println("Переплата для расчета клиента: " + clientCredit);
        bankWorker.showPersonInfo();
        double bankWorkerCredit = bankWorker.calcCredit(1050000, 13);
        System.out.println("Переплата для расчета работника банка: " + bankWorkerCredit);

        Truck truck = new Truck(1000, "Грузовик-1", '1', 100.0f, 8, 5000.0);
        truck.outPut();
        truck.newWheels(10);

        ChildClass childClass = new ChildClass(11);
        childClass.showNumFromParent();

        HeirClass heir = new HeirClass();
        heir.askInfo();
        heir.showInfo();
    }
}
