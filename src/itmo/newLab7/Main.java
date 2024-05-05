package itmo.newLab7;

import itmo.newLab7.Airplane;

    public class Main {
        public static void main(String[] args){
            itmo.newLab7.Airplane airplane = new itmo.newLab7.Airplane();
            itmo.newLab7.Airplane.Wing rightWing = airplane.new Wing(12.4);
            Airplane.Wing lefiWing = airplane.new Wing(24.5);
            rightWing.showWeight();
            lefiWing.showWeight();

        }
    }

