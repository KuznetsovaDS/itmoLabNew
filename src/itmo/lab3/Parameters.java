package itmo.lab3;

public class Parameters {
    private String color;
    private String name;
    private double weight;

    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String displayParameters(){
        String result = "Цвет " + color + "\n" + "Наименование " + name + "\n" + "Вес " + weight;
        return result;
    }
    public Parameters(){
    }
    public Parameters(String color){
        this.color = color;
    }
    public Parameters(String color, double weight){
        this.color = color;
        this.weight = weight;
    }
}
