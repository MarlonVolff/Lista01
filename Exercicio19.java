import java.util.Scanner;

public class Exercicio19{
    public static void executar(){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe o raio do cilindro: ");
    double raio = leitor.nextDouble();

    System.out.print("Informe a altura do cilindro: ");
    double altura = leitor.nextDouble();

    double volume = 3.14 * raio * raio * altura;

    System.out.println("OVolume do cilindro é; " + volume);
    leitor.close();
   }   
}