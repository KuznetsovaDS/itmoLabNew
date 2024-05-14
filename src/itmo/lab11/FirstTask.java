package itmo.lab11;

public class FirstTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Поток " + Thread.currentThread().getName() + "- начало выполнения " + Thread.currentThread().getState());
        for (int i = 0; i <= 100; i++){
            System.out.println("Поток " + Thread.currentThread().getName() + i);
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " после выполнения " + Thread.currentThread().getState());
    }
}

