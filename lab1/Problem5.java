package lab1;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Arrays;

public class Problem5 {

    /**
     * Метод isGeometricProgression определяет, является ли данная последовательность чисел numbers геометрической
     * прогрессией (возможно, при перестановке элементов)
     *
     * @param numbers строка, содержащая n положительных целых чисел, разделенных запятой
     * @return true, если последовательность является геометрической прогрессией
     *         false, если последовательность не является геометрической прогрессией
     *
     * ПРИМЕР1:
     * Вход: numbers = "1,2,4,8,16"
     * Выход: true
     *
     * ПРИМЕР2:
     * Вход: numbers = "16,2,8,1,4"
     * Выход: true (так как в результате перестановки элементов можно получить геометрическую прогрессию [1,2,4,8,16])
     *
     * ПРИМЕР3:
     * Вход: numbers = "2,3,5"
     * Выход: false
     */
    public static boolean isGeometricProgression(String numbers) {
        String[] string = numbers.split(",");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
        System.out.print("Array : "+ Arrays.toString(arr)+'\n');

        Arrays.sort(arr);

        double q=arr[1]/arr[0];
        if(arr[0]==0||arr.length<=2){
            System.out.println("false, put in more numbers");
            return false;
        }
        else{
            if(((arr[1]*q*2)/2)==arr[2]){
                System.out.println("true");
                return true;
            }
            else {
                System.out.println("false");
                return false;
            }
        }
    }

}