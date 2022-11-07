package lab1;
import java.util.Random;
import java.util.Arrays;
import java.util.*;  

public class lab1 {
    public static void main(String[] args) {
        System.out.println("Problem 1: "+'\n');
        Problem1.containsDigitAInHexadecimalRepresentation(10);
        System.out.println('\n');
        System.out.println("Problem 2: "+'\n');
        Random rd = new Random();
        int[] param;
        param = new int[10];
        for (int i=0; i<10; i++){
            param[i] = rd.nextInt(100);
        }
        Problem2.segregateEvenAndOddNumbers(param);
        System.out.println('\n');
        double[] values = new double[]{2.0, 1.0, 5.0}, weights = new double[]{1.0, 1.0, 2.0};
        double maximumWeightCapacity = 2.5;
        System.out.println('\n');

        System.out.println("Problem 3: "+'\n');
        Problem3.solveKnapsackProblem(values, weights, maximumWeightCapacity);
        System.out.println('\n');

        System.out.println("Problem 4: "+'\n');
        int[][] matrix= new int [3][3];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=rd.nextInt(100);
                System.out.println(matrix[i][j]+" ");
            }
        }
        System.out.println("Matrix: [");
        for(int i=0;i<matrix.length;i++){
                System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("]");
        Problem4.flattenMatrix(matrix);
        System.out.println('\n');

        System.out.println("Problem 5: "+'\n');
        Scanner input = new Scanner(System.in);
        //System.out.println("Please enter array size: ");
        //int n = input.nextInt();;
        //int[] numbers = new int[n];
        System.out.println("Please enter array using comas (Example 1,2,34,5,6,7,89): ");
        String numbersArray=input.next();
        Problem5.isGeometricProgression(numbersArray);
    }

}



