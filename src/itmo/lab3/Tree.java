package itmo.lab3;

public class Tree {
    private int age;
    private boolean alive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
    public void setTree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }
    public void displayTree() {
        System.out.println("Дерево " + name);
        System.out.println("Возраст " + age);
        System.out.println("Живое " + alive);
    }
}

