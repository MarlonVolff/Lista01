import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner leitor = new  Scanner(System.in); 

        System.out.printf("Digite o valor da variavel A: ");
        int a = leitor.nextInt();
        System.out.printf("Digite o valor da variavel B: ");
        int b = leitor.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Valores originais:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        System.out.println("Valores trocados:");
        System.out.println("A: " + b);
        System.out.println("B: " + a);

        leitor.close();
    }
}