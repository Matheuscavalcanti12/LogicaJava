import java.util.Scanner;
/*O programa deve:

Pedir produtos até o usuário digitar "fim"

Para cada produto:
Nome
Preço

No final mostrar:
Total da compra
Produto mais caro
Produto mais barato
Quantidade de produtos
*/
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double total = 0;
        double maiorPreco = 0;
        double menorPreco = 0;

        String nomeMaisCaro = "";
        String nomeMaisBarato = "";

        int contador = 0;

        while (true) {
            System.out.println("Digite o nome do produto (ou 'fim' para sair): ");
            String nome = teclado.nextLine();

            if (nome.equals("fim")) {
                break;
            }

            System.out.println("Digite o preço: ");
            double preco = teclado.nextDouble();
            teclado.nextLine();

            total += preco;
            contador++;

            if (contador == 1) {
                maiorPreco = preco;
                menorPreco = preco;
                nomeMaisCaro = nome;
                nomeMaisBarato = nome;
            } else {
                if (preco > maiorPreco) {
                    maiorPreco = preco;
                    nomeMaisCaro = nome;
                }

                if (preco < menorPreco) {
                    menorPreco = preco;
                    nomeMaisBarato = nome;
                }
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Mais caro: " + nomeMaisCaro + " - " + maiorPreco);
        System.out.println("Mais barato: " + nomeMaisBarato + " - " + menorPreco);
        System.out.println("Quantidade: " + contador);
    }
}