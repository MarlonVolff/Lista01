import java.util.Scanner;

public class Exercicio01 {

    public static void executar() {  

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leitor.nextInt();
        if (num > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número maior ou iual a 10!");
        }
        leitor.close();
    }
}