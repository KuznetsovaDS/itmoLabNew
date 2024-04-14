package itmo.lab3;

public class Main {
    public static void main(String[] args) {

//exercise 1
        Study study = new Study("Изучение Java - это просто!");
        System.out.println((study.printCourse()));
        System.out.println();

//exercise 2
        /*Parameters parameters1 = new Parameters();
        parameters1.setColor("Красный");
        parameters1.setName("Наименование 1");
        parameters1.setWeight(14.5);

        Parameters parameters2 = new Parameters();
        parameters2.setColor("Зеленый");
        parameters2.setName("Наименование 2");
        parameters2.setWeight(15.5);*/

        Parameters parameters1 = new Parameters("Красный");
        Parameters parameters2 = new Parameters("Зеленый", 15.5);

        System.out.println(parameters1.displayParameters());
        System.out.println();
        System.out.println(parameters2.displayParameters());
        System.out.println();

//exercise 3
        House house1 = new House();
        house1.setParameters(11, 2000, "Дом1");
        house1.displayParameters();
        System.out.println("Лет с момента постройки " + house1.buildingAge());
        System.out.println();

        House house2 = new House();
        house2.setParameters(9, 1958, "Дом2");
        house2.displayParameters();
        System.out.println("Лет с момента постройки " + house2.buildingAge());
        System.out.println();

//exercise 4
        Tree tree1 = new Tree(100, "Дуб");
        Tree tree2 = new Tree(5, true, "Ива");
        Tree tree3 = new Tree();

        tree1.displayTree();
        System.out.println();

        tree2.displayTree();
        System.out.println();

        tree3.setTree(50, false, "Ель");
        tree3.displayTree();
    }
}
