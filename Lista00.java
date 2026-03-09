import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número para encontrar o valor do seu fatorial: ");
        int x = leitor.nextInt();
        double fatorial = 1; 

        for(int i = 1; i <= x; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + x + " é: " + fatorial);
        leitor.close();
    }
}
