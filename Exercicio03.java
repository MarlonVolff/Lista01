import java.util.Scanner;

public class Exercicio03 {
    
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Digite o primeiro número: ");
        int a = leitor.nextInt();
        System.out.printf("Digite o segundo número: ");
        int b = leitor.nextInt();

        if(a == b){
            System.out.println("A sequencia de números informados é inválida.");
        } else if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        leitor.close();
    }
}
