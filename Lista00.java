import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos (n):");
        int n = leitor.nextInt();

        int[] prog = new int[n];
        int[] model = new int[n];
        System.out.println("Digite as matriculas de Programacao:");
        for (int i = 0; i < n; i++) {
            prog[i] = leitor.nextInt();
        }

        System.out.println("Digite as matriculas de Modelagem:");
        for (int i = 0; i < n; i++) {
            model[i] = leitor.nextInt();
        }

        System.out.println("Alunos matriculados em ambas as UCs (Interseção):");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (prog[i] == model[j]) {
                    System.out.println("Matricula: " + prog[i]);
                    break;
                }
            }
        }

        leitor.close();
    }
}
