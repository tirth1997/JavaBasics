package DGV;

public class DGVInterview {

    public static void main(String[] args){

        for (int i =0;i<=5;i++){
            for (int j=0;j<=i/2;j++){
                System.out.print("*");
            }
            for (int j=i/2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
