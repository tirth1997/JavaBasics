package Easy;

public class Main {
    public static void main(String[] args) {
        Main obj =new Main();
        String A= " Hello World ";
        String[] stringArray = A.split("\\s+");
        String result = obj.solve(A);
        System.out.println(result);
    }

    public String solve(String A) {
        StringBuilder sb =new StringBuilder();
        String[] stringArray = A.trim().split("\\s+");
        int i=stringArray.length;
        while (i>0){
            sb.append(stringArray[i-1]+" ");
            i--;
        }
        return sb.toString().trim();
    }
}