package lab1;
import java.util.Arrays;

public class Problem2 {
    /**
     * Метод segregateEvenAndOddNumbers разделяет четные и нечетные числа в массиве array, т.у. возвращает массив,
     * в котором сперва записаны все четные числа массива array в порядке их следования, а затем все нечетные числа
     * массива array в порядке их следования.
     *
     * @param array массив положительных чисел
     * @return массив с разделенными четными и нечетными числами
     *
     * ПРИМЕР:
     * Вход: array = [2, 1, 5, 6, 8]
     * Выход: [2, 6, 8, 1, 5]
     */
    public static int[] segregateEvenAndOddNumbers(int[] array) {
        for(int i=0; i<array.length; i++){
            if(array[i]%2 == 0){
                array[i]*=-1;
            }
        } 
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(array[i]%2 == 0){
                array[i]*=-1;
            }
        } 
        System.out.println(Arrays.toString(array));
        return array;
    }

}