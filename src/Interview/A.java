package Interview;
class B extends A{
    public static String run(String result,int number){
        return result;
    }

    public void m1(int a,int b){
        System.out.println("m1 a= "+a+" b="+b);
    }
    public void m1(double b,int a){
        System.out.println("m1 a= "+a+" b="+b);
    }
}
public class A {

    public static void run(){
        System.out.println("Void Method");
    }

    public static String run(String result,int number){
        return result;
    }

    public static String run(int number,String result){
        return result;

    }

    public static void main(String[] args){
        run();
    }
}
