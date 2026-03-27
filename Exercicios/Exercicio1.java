//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//exercicio 1.
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite sua idade: ");
        int idade  = teclado.nextInt();

        if(idade < 16){
            System.out.println("Você não pode votar!");
        }else if(idade <=17){
            System.out.println("Voto Opcional!");
        }else if(idade <=69){
            System.out.println("Voto Obrigatório!");
        }else{
            System.out.println("Voto Opcional!");
        }

        }
    }
