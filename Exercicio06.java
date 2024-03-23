import java.util.Scanner;

public class Exercicio06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius: ");
        int celsius = leitor.nextInt();
        int fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        leitor.close();
    }
}
