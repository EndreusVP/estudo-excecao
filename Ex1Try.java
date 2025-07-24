import java.util.Scanner;

public class Ex1Try {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero x: ");
        int x = entrada.nextInt();

        System.out.println("Digite um numero y: ");
        int y = entrada.nextInt();

        if(y == 0) {
            try {
                int res = x / y;
                System.out.println("resultado da divisão : " + res);
            } catch (ArithmeticException e) {
                System.err.println("ERRO: NÃO É POSSIVEL FAZER DIVISÃO POR " + y);
            } finally {
                System.out.println("Tente novamente...");
            }
        } else {
            int res = x / y;
            System.out.println("resultado da divisão : " + res);
        }

        entrada.close();

    }
}