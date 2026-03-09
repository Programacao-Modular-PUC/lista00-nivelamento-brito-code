import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] valores = new int[3];
        System.out.println("Digite o valor de X:");
        valores[0] = leitor.nextInt();
        System.out.println("Digite o valor de Y:");
        valores[1] = leitor.nextInt();
        System.out.println("Digite o valor de Z:");
        valores[2] = leitor.nextInt();

        // --- 1. Calcular o Maior ---
        int maior = valores[0];
        if (valores[1] > maior) maior = valores[1];
        if (valores[2] > maior) maior = valores[2];
        System.out.println("Maior valor: " + maior);

        // --- 2. Calcular o Menor ---
        int menor = valores[0];
        if (valores[1] < menor) menor = valores[1];
        if (valores[2] < menor) menor = valores[2];
        System.out.println("Menor valor: " + menor);

        // --- 3. Testar Intervalo [y, z] ---
        int inicio = Math.min(valores[1], valores[2]);
        int fim = Math.max(valores[1], valores[2]);

        if (valores[0] >= inicio && valores[0] <= fim) {
            System.out.println("O numero x (" + valores[0] + ") ESTA dentro do intervalo [" + inicio + ", " + fim + "]");
        } else {
            System.out.println("O numero x (" + valores[0] + ") ESTA FORA do intervalo [" + inicio + ", " + fim + "]");
        }

        if (valores[0] % valores[1] == 0 && valores[0] % valores[2] == 0) {
            System.out.println("X e divisivel por Y e por Z ao mesmo tempo.");
        } else {
            System.out.println("X NAO e divisivel por Y e Z simultaneamente.");
        }

        leitor.close();
    }
}
