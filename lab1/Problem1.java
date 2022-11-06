package lab1;

public class Problem1{
    public static boolean containsDigitAInHexadecimalRepresentation(int number) {
        String param = Integer.toHexString(number);
        int i= param.indexOf('a');
        if(i== -1){
            System.out.println(param); 
            return false;
        }
        else{
            System.out.println("true"); 
            return true;
        }
    }
}