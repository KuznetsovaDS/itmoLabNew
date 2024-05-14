package itmo.lab11;

public class ThreadName extends Thread{
    private String name;
    private  static final Object lock = new Object();

    public ThreadName (String name){
        this.name = name;
    }
    @Override
    public void run(){
        while (true){
            synchronized (lock){
                try {
                    System.out.println(this.name);
                    lock.notify();
                    lock.wait();
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}

