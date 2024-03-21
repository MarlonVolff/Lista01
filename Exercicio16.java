import java.util.Scanner;

public class Exercicio16{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        int  nota1 = leitor.nextInt();
        System.out.print("Informe a segunda nota: ");
        int nota2 = leitor.nextInt();
        System.out.print("Informe a terceira nota: ");
        int nota3 = leitor.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Média: " + media);

        leitor.close();
    }
}