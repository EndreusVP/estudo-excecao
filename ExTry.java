public class ExTry {
    public static void main(String[] args) {
        
        try {
            //int x = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("item não pode ser executado");
        } finally {
            System.out.println("sempre sera executado");
        }
    }
}