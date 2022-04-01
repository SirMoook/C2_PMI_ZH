import java.util.ArrayList;

public class Matrix {

    public static int numberOfNonZeroValues(int [][] matrix){
        int result=0;

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]!=0){
                    result++;
                }
            }
        }

        return result;
    }

    public static ArrayList<Integer> indexOfColumnsWithSameValues(int[][]matrix){
        int[] nullColoumn = new int[matrix[0].length];

        ArrayList<Integer> result=new ArrayList();
            for (int i=0;i<matrix.length;i++){
                for (int j=0;j<matrix[i].length;j++){
                    if (matrix[i][j]==matrix[0][j]){
                    nullColoumn[j]++;
                    }
            }
        }

        for (int i=0;i<nullColoumn.length;i++) {
            if (nullColoumn[i]==matrix.length){
            result.add(i);
            }
        }
        return result;
    }

}