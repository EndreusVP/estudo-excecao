import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2Try {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero x: ");
        int x = entrada.nextInt();
        
        System.out.println("Digite um numero y: ");
        int y = entrada.nextInt();

        try {
            int res = x + y;
            System.out.println("resultado da sua soma : " + res);
        }catch(InputMismatchException e) {
            e.getMessage();
            e.printStackTrace();
        }

        entrada.close();
    }
}
