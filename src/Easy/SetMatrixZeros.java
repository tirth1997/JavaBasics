package Easy;

import java.util.ArrayList;
import java.util.HashMap;

/*
*Problem Description



Given a matrix, A of size M x N of 0s and 1s. If an element is 0, set its entire row and column to 0.
Note: This will be evaluated on the extra memory used. Try to minimize the space and time complexity.



Problem Constraints
1 <= N, M <= 1000
0 <= A[i][j] <= 1


Input Format
The first and the only argument of input contains a 2-d integer matrix, A, of size M x N.


Output Format
Return a 2-d matrix that satisfies the given conditions.


Example Input
Input 1:
[   [1, 0, 1],
    [1, 1, 1],
    [1, 1, 1]   ]
Input 2:
[   [1, 0, 1],
    [1, 1, 1],
    [1, 0, 1]   ]


Example Output
Output 1:
[   [0, 0, 0],
    [1, 0, 1],
    [1, 0, 1]   ]
Output 2:
[   [0, 0, 0],
    [1, 0, 1],
    [0, 0, 0]   ]
* */
public class SetMatrixZeros {
    public static void main(String[] args){

        SetMatrixZeros setMatrixZeros=new SetMatrixZeros();
        ArrayList<Integer> valueArray=new ArrayList<>();
        valueArray.add(1);
        valueArray.add(0);
        valueArray.add(1);

        ArrayList<ArrayList<Integer>> inputArray=new ArrayList<>();
        inputArray.add(valueArray);
        valueArray =new ArrayList<>();
        valueArray.add(1);
        valueArray.add(1);
        valueArray.add(1);
        inputArray.add(valueArray);
        valueArray =new ArrayList<>();
        valueArray.add(1);
        valueArray.add(0);
        valueArray.add(1);
        inputArray.add(valueArray);

        setMatrixZeros.setZeroes(inputArray);
    }
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        HashMap<Integer, Integer> rmap = new HashMap<>();
        HashMap<Integer, Integer> cmap = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(0).size(); j++) {

                if (a.get(i).get(j) == 0) {
                    rmap.put(i, j);
                    cmap.put(j, i);
                }
            }
        }

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(0).size(); j++) {

                if (cmap.containsKey(j)) {
                    a.get(i).set(j, 0);
                }
                if (rmap.containsKey(i)) {
                    a.get(i).set(j, 0);
                }

            }
        }

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                System.out.print(a.get(i).get(j));
            }
            System.out.println();
        }
    }
}

