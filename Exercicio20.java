import java.util.Scanner;

public class Exercicio20{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o tempo de viagem: ");
        double tempoViagem = leitor.nextDouble();
        System.out.print("Informe a velocidade média: ");
        double veloMed = leitor.nextDouble();

        double distancia = tempoViagem * veloMed;
        double litrosCombus = distancia / 12.0;

        System.out.printf("Quantidade de litros do combustível que gasta sera: " + litrosCombus);

        leitor.close();
    }
}
