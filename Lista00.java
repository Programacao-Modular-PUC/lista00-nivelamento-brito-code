import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade = 0;
        int maiorIdade = -1;
        int menorIdade = 999;
        int contFemininoFiltro = 0;

        System.out.println("--- Pesquisa Habitacional (Digite -1 na idade para encerrar) ---");

        while (true) {
            System.out.print("Idade: ");
            idade = leitor.nextInt();

            if (idade == -1) {
                break;
            }

            System.out.print("Sexo (m/f): ");
            char sexo = leitor.next().toLowerCase().charAt(0);

            System.out.print("Cor dos olhos (azuis, verdes, castanhos): ");
            String olhos = leitor.next().toLowerCase();

            System.out.print("Cor dos cabelos (louros, castanhos, pretos): ");
            String cabelos = leitor.next().toLowerCase();

            if (idade > maiorIdade) maiorIdade = idade;
            if (idade < menorIdade) menorIdade = idade;


            if (sexo == 'f' && (idade >= 18 && idade <= 35) && 
                olhos.equals("verdes") && cabelos.equals("louros")) {
                contFemininoFiltro++;
            }
            
            System.out.println("--------------------------------");
        }

   
        if (maiorIdade != -1) {
            System.out.println("\n--- RESULTADO DA PESQUISA ---");
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres entre 18-35 anos, olhos verdes e cabelos louros: " + contFemininoFiltro);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        leitor.close();
    }
}
