package InterviewQuestion;
interface Aparent{
    void print();
}

class Aimplementation implements Aparent{

    @Override
    public void print() {
        System.out.println("Aimplementation class");
    }
}
public class InterfaceExample2 {

    public static void main(String[] args){
        Aparent aparent=new Aimplementation();
        aparent.print();
    }
}
