import java.util.Scanner;

public class Exercicio11 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = leitor.nextInt();
        int menor, meio, maior;

        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if (num2 < num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
            } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            if (num1 < num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 < num2) {
                meio = num1;
                maior = num2;
                } else {
                meio = num2;
                maior = num1;
            }
        }
        System.out.println("Os números em ordem crescente são: " + menor + ", " + meio + ", " + maior);
        leitor.close();
    }
}
