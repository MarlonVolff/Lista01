import java.util.Scanner;

public class Exercicio13{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                resultado = a / b;
                break;
            default:
                System.out.println("Operador não definido.");
                return; 
        }

        System.out.println("Resultado da operação: " + resultado);
        leitor.close();
    }
}
