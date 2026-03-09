import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[6];
        int somaPares = 0;
        int qtdImpares = 0;

        System.out.println("Digite 6 numeros inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Numero na posicao " + (i + 1) + ": ");
            numeros[i] = leitor.nextInt();
        }

        System.out.println("\n--- RELATORIO ---");

        System.out.println("Os numeros pares sao:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("numero " + numeros[i] + " na posicao " + (i + 1));
                somaPares += numeros[i];
            }
        }
        System.out.println("Soma dos pares = " + somaPares);

        
        System.out.println("\nOs numeros impares sao:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("numero " + numeros[i] + " na posicao " + (i + 1));
                qtdImpares++;
            }
        }
        System.out.println("Quantidade de impares = " + qtdImpares);

        leitor.close();
    }
}
