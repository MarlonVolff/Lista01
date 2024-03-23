import java.util.Scanner;

public class Exercicio07{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = leitor.nextInt();

        if(num >= 100 && num <= 200){
            System.out.println("O número está no intervalo entre 100 e 200.");
            } else {
            System.out.println("O número esta fora do intervalo entre 100 e 200.");
        }
        
        leitor.close();
    }
}
