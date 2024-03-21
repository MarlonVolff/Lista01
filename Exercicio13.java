import java.util.Scanner;

public class Exercicio13{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scanner.next();

        int resultado = 0;

        string(operador) {
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
                return; // Encerra o programa se o operador não for válido
        }

        System.out.println("Resultado da operação: " + resultado);
        leitor.close();
    }
}