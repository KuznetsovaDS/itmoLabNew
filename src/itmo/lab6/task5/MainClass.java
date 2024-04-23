package itmo.lab6.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClass {
    protected Integer age;

    protected BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public void askInfo() throws IOException {

        System.out.println("введите возраст ");
        age = Integer.parseInt(r.readLine());
    }
}
