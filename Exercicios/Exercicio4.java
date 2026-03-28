import java.util.Scanner;
//1. Pedir as 5 notas ao usuário
//Mostrar todas as notas digitadas
//Calcular a média


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       float [] array = new float[5];
       float media = 0;
       float soma =0;

       for(int i = 0; i < array.length;i++){
           System.out.println("Digite sua " + i + "nota: ");
           array[i] = teclado.nextFloat();

            soma += array[i];

       }
        media = soma/array.length;
        System.out.println("Sua media: " + media);
    }

}
