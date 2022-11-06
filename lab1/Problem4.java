package lab1;
import java.util.Arrays;

public class Problem4 {

    /**
     * Метод flattenMatrix преобразует матрицу размера nxm в одномерный массив, записывая сперва элементы первого столбца,
     * затем элементы второго столбца и т.д.
     *
     * @param matrix матрица размера nxm
     * @return одномерный массив
     *
     * ПРИМЕР:
     * Вход: matrix = [[1, 2, 3],
     *                 [4, 5, 6],
     *                 [7, 8, 9]]
     * Выход: [1, 4, 7, 2, 5, 8, 3, 6, 9]
     */
    public static int[] flattenMatrix(int[][] matrix) {
        int arrayFromMatrix[]=new int [matrix.length*matrix[0].length];
        int t=0;
        while(t<arrayFromMatrix.length)
        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[0].length; j++){
                    arrayFromMatrix[t]=matrix[i][j];
                    t++;
                    //System.out.println(arrayFromMatrix[i]);
            }
        }
        System.out.println(Arrays.toString(arrayFromMatrix));
        return null;
    }

}