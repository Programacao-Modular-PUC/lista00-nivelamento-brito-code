import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char[] gabarito = new char[8];
        int totalAlunos = 10;
        int aprovados = 0;

    
        System.out.println("--- Cadastro do Gabarito (8 questões) ---");
        for (int i = 0; i < 8; i++) {
            System.out.print("Resposta da questao " + (i + 1) + ": ");
            gabarito[i] = leitor.next().toUpperCase().charAt(0);
        }

        for (int a = 1; a <= totalAlunos; a++) {
            System.out.println("\n--- Dados do Aluno " + a + " ---");
            System.out.print("Numero do aluno: ");
            int numeroAluno = leitor.nextInt();
            
            int nota = 0;
            for (int i = 0; i < 8; i++) {
                System.out.print("Resposta da questao " + (i + 1) + ": ");
                char resposta = leitor.next().toUpperCase().charAt(0);
                
               
                if (resposta == gabarito[i]) {
                    nota++;
                }
            }

            System.out.println("Aluno " + numeroAluno + " - Nota final: " + nota);

        
            if (nota >= 6) {
                aprovados++;
            }
        }

        double porcentagemAprovacao = (double) aprovados / totalAlunos * 100;
        System.out.println("\n--- RELATORIO FINAL ---");
        System.out.println("Porcentagem de aprovacao: " + porcentagemAprovacao + "%");

        leitor.close();
    }
}
