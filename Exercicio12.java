import java.util.Scanner;

public class Exercicio12{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.println("Digite o número do mês: ");
        int numMes = leitor.nextInt();

        if (numMes >= 1 && numMes <= 12) {
            System.out.println("O mÊs correspondente é: " + meses[numMes - 1]);
        } else {
            System.out.println("Mês inválido");
        }
        leitor.close();
    }
}