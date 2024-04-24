package itmo.lab6.task4;

public class ChildClass extends ParentClass{
    public ChildClass(int num){
        super(num);
    }
    public void showNumFromParent(){
        System.out.println(getNum());
    }

}
