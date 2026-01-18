package Inheritance;

public class ConstructorCallSqeuence {

    public static void main(String[] args){
        ChildOne childTwo=new ChildTwo();
        childTwo.display();
    }
}
class ChildOne{
    public ChildOne(){
        System.out.println("Constructor of ChildOne");
    }
    public void display(){
        System.out.println("Method of ChildOne");
    }
}

class ChildTwo extends ChildOne{
    public ChildTwo(){
        System.out.println("Constructor of ChildTwo");
    }
    public void display(){
        System.out.println("Method of ChildTwo");
    }
}