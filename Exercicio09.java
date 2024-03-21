import java.util.Scanner;

public class Exercicio09{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = leitor.nextInt();
        System.out.println("Digite outro numero: ");
        int b = leitor.nextInt();

        if(a == b){
            System.out.println("Os numeros sao iguais");
            }else{
            System.out.println("Os numeros sao diferentes");
            if(a > b){
            System.out.println("O número A é maior que o número B.");
            } else {
                System.out.println("O número B é maior que o número A.");
            }
        }
    }
}