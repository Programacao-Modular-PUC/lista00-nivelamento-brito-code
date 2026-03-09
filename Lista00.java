import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double[] temperaturas = new double[12];
        String[] meses = {
            "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura media de " + meses[i] + ": ");
            temperaturas[i] = leitor.nextDouble();
        }

        double maiorTemp = temperaturas[0];
        int indiceMaior = 0;
        
        double menorTemp = temperaturas[0];
        int indiceMenor = 0;

        for (int i = 1; i < 12; i++) {
            if (temperaturas[i] > maiorTemp) {
                maiorTemp = temperaturas[i];
                indiceMaior = i;
            }
            if (temperaturas[i] < menorTemp) {
                menorTemp = temperaturas[i];
                indiceMenor = i;
            }
        }

        System.out.println("\n--- RELATORIO CLIMATICO ANUAL ---");
        System.out.println("Maior temperatura: " + maiorTemp + " (" + meses[indiceMaior] + ")");
        System.out.println("Menor temperatura: " + menorTemp + " (" + meses[indiceMenor] + ")");

        leitor.close();
    }
}
