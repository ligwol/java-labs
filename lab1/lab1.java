package lab1;
    public class lab1 {
        public static boolean containsDigitAInHexadecimalRepresentation(int number) {
            String param = Integer.toOctalString(number);
            int i= param.indexOf('A');
            if(i== -1){
                System.out.println(param); 
                return false;
            }
            else{
                System.out.println("true"); 
                return true;
            }
        }
    public static void main(String[] args) {
        lab1.containsDigitAInHexadecimalRepresentation(25);
        System.out.println("Hello, World!"); 
    }
    
}