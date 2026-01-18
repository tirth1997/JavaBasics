package InterviewQuestion;

interface A{
    void print();
}
public class InterfaceExample implements A {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args){
        A aObj = new InterfaceExample();
        aObj.print();
    }
}
