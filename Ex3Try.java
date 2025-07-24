import java.util.ArrayList;
import java.util.Scanner;

public class Ex3Try {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        num.add(1);
        num.add(2);
        num.add(3);

        try {
            System.out.println("digite um numerod e 0 a 2: ");
            int x = entrada.nextInt();
            System.out.println("Você acessou esse numero no Array: " + num.get(x));
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.err.println(" ERR: a posição q vc digitou nao existe " + e.getMessage());
            e.printStackTrace();
        }

        entrada.close();

    }
}
