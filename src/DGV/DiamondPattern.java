package DGV;

public class DiamondPattern {

    public static void main(String[] args){
        int i,j,number=3;
        // First half of diamond
        for (i=0;i<number;i++){
            for (j=0;j<number-i;j++){
                System.out.print(" ");
            }
            for (j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Second half of diamond
        for (i=number;i>0;i--){
            for (j=0;j<number-i;j++){
                System.out.print(" ");
            }
            for (j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
