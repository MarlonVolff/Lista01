import java.util.Scanner;

public class Exercicio17{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

         System.out.print("Informe a primeira nota: ");
         int nota1 = leitor.nextInt();
         System.out.print("Informe o peso da primeira nota: ");
         int peso1 = leitor.nextInt();
 
         System.out.print("Informe a segunda nota: ");
         int nota2 = leitor.nextInt();
         System.out.print("Informe o peso da segunda nota:");
         int peso2 = leitor.nextInt();
 
         System.out.print("Informe a terceira nota:");
         int nota3 = leitor.nextInt();
         System.out.print("Informe o peso da terceira nota: ");
         int peso3 = leitor.nextInt();
 
         int mediaPond = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
         System.out.printf("Média ponderada: " + mediaPond);
        leitor.close();
    }
}