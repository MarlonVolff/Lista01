import java.util.Scanner;

public class Exercicio02 {

    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primiro número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        int sum = num1 + num2;
        System.out.printf("A soma é: "+  num1 + num2 + sum);

        leitor.close();
    }
}