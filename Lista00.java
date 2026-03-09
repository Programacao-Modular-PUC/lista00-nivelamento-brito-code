import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[][] vendas = new double[12][4];
        String[] meses = {
            "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

 
        System.out.println("--- Cadastro de Vendas Anuais ---");
        for (int i = 0; i < 12; i++) {
            System.out.println("Vendas de " + meses[i] + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("  Semana " + (j + 1) + ": R$ ");
                vendas[i][j] = leitor.nextDouble();
            }
        }


        System.out.println("\n--- TOTAL VENDIDO POR MES ---");
        double totalAno = 0;
        for (int i = 0; i < 12; i++) {
            double totalMes = 0;
            for (int j = 0; j < 4; j++) {
                totalMes += vendas[i][j];
            }
            totalAno += totalMes;
            System.out.println(meses[i] + ": R$ " + totalMes);
        }


        System.out.println("\n--- TOTAL VENDIDO POR SEMANA (NO ANO) ---");
        for (int j = 0; j < 4; j++) {
            double totalSemana = 0;
            for (int i = 0; i < 12; i++) {
                totalSemana += vendas[i][j];
            }
            System.out.println("Semana " + (j + 1) + ": R$ " + totalSemana);
        }

       
        System.out.println("\nTOTAL VENDIDO PELA LOJA NO ANO: R$ " + totalAno);

        leitor.close();
    }
}
