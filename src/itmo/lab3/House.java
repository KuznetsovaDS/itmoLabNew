package itmo.lab3;

import java.time.LocalDate;

public class House {
    private int floors;
    private int year;
    private String name;

    public void setParameters (int floors, int year, String name){
        this.floors = floors;
        this.year = year;
        this.name = name;
    }
    public void displayParameters (){
        System.out.println("Этажи " + floors);
        System.out.println("Год постройки  " + year);
        System.out.println("Наименование " + name);
    }
    public int buildingAge(){
        int currentYear = LocalDate.now().getYear();
        return currentYear - year;
    }
}

