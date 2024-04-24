package itmo.lab6.task3;

public class Truck extends Car{
    private int wheels;
    private double maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheels, double maxWeight){
        super(weight, model, color, speed);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }
    public void newWheels(int newWheels){
        this.wheels = newWheels;
        System.out.println("Новое кол-во колес - " +  newWheels);
    }
}
