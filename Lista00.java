import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor X (n):");
        int n = leitor.nextInt();
        int[] X = new int[n];

        System.out.println("Digite o tamanho do vetor Y (m):");
        int m = leitor.nextInt();
        int[] Y = new int[m];

        System.out.println("Digite os elementos de X:");
        for (int i = 0; i < n; i++) X[i] = leitor.nextInt();

        System.out.println("Digite os elementos de Y:");
        for (int i = 0; i < m; i++) Y[i] = leitor.nextInt();

        int[] Z = new int[n + m];
        int k = 0; 

        for (int i = 0; i < n; i++) {
            Z[k++] = X[i];
        }

        for (int i = 0; i < m; i++) {
            boolean jaExiste = false;
            for (int j = 0; j < k; j++) {
                if (Y[i] == Z[j]) {
                    jaExiste = true;
                    break;
                }
            }
            if (!jaExiste) {
                Z[k++] = Y[i];
            }
        }

        System.out.print("Vetor Uniao Z: ");
        for (int i = 0; i < k; i++) {
            System.out.print(Z[i] + " ");
        }

        leitor.close();
    }
}
