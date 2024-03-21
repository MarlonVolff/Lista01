import java.util.Scanner;

public class Exercicio14{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);    
        
        System.out.print("Digite o primeiro termo: ");
        int a1 = leitor.nextInt();

        System.out.print("Digite a razão: ");
        int n = leitor.nextInt();

        System.out.print("Digite o valor de n: ");
        int r = leitor.nextInt();

        int an = a1 + (n - 1) * r;

        System.out.println("O termo de ordem " + n + " é: " + an);
    }
}