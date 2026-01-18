package Inheritance;

public class InheritanceExample2 {
        public static void main(String[] args)
        {
            Cl3 c3 = new Cl3();
            c3.f1();
        }
}
class Cl1
{
    void f1(){
        System.out.println("f1 in class C1");
    }
}
class Cl2 extends Cl1
{
    void f1() {
       // super.f1();
        System.out.println("f1 in class C2");
    }
}
class Cl3 extends Cl2
{
    void f1() {
       // super.f1();
        System.out.println("f1 in class C3");
    }
}