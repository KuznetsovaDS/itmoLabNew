package itmo.lab2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sumDouble = calculator.sum(5.5, 2.5);
        long sumLong = calculator.sum(3L, 50L);
        int sumInt = calculator.sum(10, 15);

        double divideDouble = calculator.divide(5.5, 2.5);
        double divideLong = calculator.divide(3L, 50L);
        double divideInt = calculator.divide(10, 15);

        double multiplyDouble = calculator.multiply(5.5, 2.5);
        long multiplyLong = calculator.multiply(3L, 50L);
        int multiplyInt = calculator.multiply(10, 15);

        double subtractDouble = calculator.subtract(5.5, 2.5);
        long subtractLong = calculator.subtract(3L, 50L);
        int subtractInt = calculator.subtract(10, 15);

        System.out.println("Сумма double: " + sumDouble);
        System.out.println("Сумма long: " + sumLong);
        System.out.println("Сумма int: " + sumInt);

        System.out.println("Деление double: " + divideDouble);
        System.out.println("Деление long: " + divideLong);
        System.out.println("Деление int: " + divideInt);

        System.out.println("Умножение double: " + multiplyDouble);
        System.out.println("Умножение long: " + multiplyLong);
        System.out.println("Умножение int: " + multiplyInt);

        System.out.println("Вычитание double: " + subtractDouble);
        System.out.println("Вычитание long: " + subtractLong);
        System.out.println("Вычитание int: " + subtractInt);

        Project myProject = new Project("New Project", "Client", 9999.9, false);
        System.out.println(myProject.toString());

       /* Project myProject = new Project();

        myProject.setProjectName("New Project");
        myProject.setCustomer("Client");
        myProject.setCost(9990.9);
        myProject.setRealized(false);

        System.out.println(myProject.toString());*/
    }

}
