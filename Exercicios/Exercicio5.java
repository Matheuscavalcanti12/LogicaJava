import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float[] nota = new float[5];
        float soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        float maior = Float.MIN_VALUE;
        float menor = Float.MAX_VALUE;

        System.out.println("Digite 5 notas:");

        for (int i = 0; i < nota.length; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            nota[i] = teclado.nextFloat();

            soma += nota[i];

            if (nota[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }

            if (nota[i] > maior) {
                maior = nota[i];
            }

            if (nota[i] < menor) {
                menor = nota[i];
            }
        }

        float media = soma / nota.length;

        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
    }
}