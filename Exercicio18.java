import java.util.Scanner;

public class Exercicio18 {
    public static void executar(){
    Scanner leitor = new Scanner(System.in);

     System.out.print("Informe a primeira nota: ");
     double nota1 = leitor.nextDouble();
     System.out.print("Informe a segunda nota: ");
     double nota2 = leitor.nextDouble();
     System.out.print("informe a terceira nota: ");
     double nota3 = leitor.nextDouble(); //double para uso de Decimal 

     double medHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

     System.out.printf("A Media harmonica é: " + medHarmonica);

    leitor.close();
    }
}
