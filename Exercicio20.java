import java.util.Scanner;

public class Exercicio20{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o tempo de viagem: ");
        double tempoViagem = scanner.nextDouble();

        System.out.print("Informe a velocidade média: ");
        double veloMed = scanner.nextDouble();

        double distancia = tempoViagem * veloMed;

        double litrosCombustivel = distancia / 12.0;


        System.out.printf("Quantidade de litros do combustível que gasta sera; " + litrosCombustivel);

        leitor.close();
    }
}