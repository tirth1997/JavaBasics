package Interview;

public class StaticMethod {

    int n1 =100;
    int n2=60;
    int sum=sum(n1,n2);

     static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args){

         StaticMethod staticMethod=new StaticMethod();
        staticMethod.n1=1;
        staticMethod.n2=1;
        System.out.println(staticMethod.sum);

        System.out.println(sum(staticMethod.n1,staticMethod.n2));

    }


}
