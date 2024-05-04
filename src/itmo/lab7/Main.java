package itmo.lab7;

import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args){
        Airplane airplane = new Airplane();
        Airplane.Wing rightWing = airplane.new Wing(12.4);
        Airplane.Wing lefiWing = airplane.new Wing(24.5);
        rightWing.showWeight();
        lefiWing.showWeight();

    }
}
