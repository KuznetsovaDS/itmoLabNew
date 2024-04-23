package itmo.lab6.task5;

import java.io.IOException;

public class HeirClass extends MainClass {
    public String name;

    @Override
    public void askInfo() throws IOException {
        super.askInfo();
        System.out.println("введите имя пользователя ");
        name = r.readLine();
    }
    public void showInfo(){
        System.out.println("Возраст пользователя " + age);
        System.out.println("Имя пользователя " + name);
    }
}
