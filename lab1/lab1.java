package lab1;
import java.util.Random;

public class lab1 {
    public static void main(String[] args) {
        Problem1.containsDigitAInHexadecimalRepresentation(10);
        Random rd = new Random();
        int[] param;
        param = new int[10];
        for (int i=0; i<10; i++){
            param[i] = rd.nextInt(100);
        }
        Problem2.segregateEvenAndOddNumbers(param);
        //Problem2.segregateEvenAndOddNumbers();
    }

}



