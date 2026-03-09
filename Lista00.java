import java.util.Scanner;

public class Lista00 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[] precos = new double[10];
        int[] quantidades = new int[10];
        double totalGeralVendas = 0;

     
        System.out.println("--- Cadastro de Vendas (10 tipos de objetos) ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Preco unitario do objeto " + (i + 1) + ": ");
            precos[i] = leitor.nextDouble();
            System.out.print("Quantidade vendida do objeto " + (i + 1) + ": ");
            quantidades[i] = leitor.nextInt();
        }

        System.out.println("\n--- RELATORIO DE VENDAS ---");
        for (int i = 0; i < 10; i++) {
            double valorTotalObjeto = precos[i] * quantidades[i];
            totalGeralVendas += valorTotalObjeto;
            System.out.println("Objeto " + (i + 1) + ": Qtd: " + quantidades[i] + 
                               " | Unitario: R$ " + precos[i] + 
                               " | Total: R$ " + valorTotalObjeto);
        }

        double comissao = totalGeralVendas * 0.05;
        double salarioFinal = 545.00 + comissao;

        System.out.println("\n--- RESULTADO FINANCEIRO ---");
        System.out.println("Valor geral das vendas: R$ " + totalGeralVendas);
        System.out.println("Valor da comissao: R$ " + comissao);
        System.out.println("Salario final do vendedor: R$ " + salarioFinal);

   
        int maiorQtd = quantidades[0];
        double precoMaisVendido = precos[0];
        int posicaoMaisVendido = 0;

        for (int i = 1; i < 10; i++) {
            if (quantidades[i] > maiorQtd) {
                maiorQtd = quantidades[i];
                precoMaisVendido = precos[i];
                posicaoMaisVendido = i;
            }
        }

        System.out.println("\nObjeto mais vendido: Valor R$ " + precoMaisVendido + 
                           " | Posicao no vetor: " + posicaoMaisVendido);

        leitor.close();
    }
}
