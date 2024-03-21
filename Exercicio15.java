import java.util.Scanner;

public class Exercicio15{
    public static void executar(){
        Scanner  leitor = new Scanner(System.in);

        System.out.println("Digite as coordenadas do ponto P1 (x1 y1):");
        int x1 = leitor.nextInt();
        int y1 = leitor.nextInt();
        System.out.println("Digite as coordenadas do ponto P2 (x2 y2):");
        int x2 = leitor.nextInt();
        int y2 = leitor.nextInt();

        int distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Distância entre os pontos: %.2f\n", distancia);


        leitor.close();
    }
}