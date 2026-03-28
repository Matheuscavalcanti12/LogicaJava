
import java.util.Scanner;
//exercicio de menu interativo

//saldo inicial =1000 - ok
//mostrar
// 1 - Ver saldo
//2 - Depositar
//3 - Sacar
//4 - Sair

//mostrar saldo - Seu saldo atual é: R$ XXXX

//Opção 2 → Depositar
//Pede um valor
//Soma ao saldo

//Opção 3 → Sacar
//Pede um valor
//Se tiver saldo suficiente → subtrai
//Se não:
//Saldo insuficiente!

//Encerrando sistema...
public class Exercicio3 {
    public static void main(String[] args) {
        float saldo = 1000;
        Scanner teclado = new Scanner(System.in);
        System.out.println("BANCO - ESCOLHA UMA OPÇÃO");

       int op = 0;
        do{
            System.out.println("1- Ver saldo | 2-Depositar |3-Sacar|4-Sair");
             op = teclado.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Indique o valor de depósito: ");
                    float deposito = teclado.nextFloat();
                    if(deposito > 0){
                        saldo+=deposito;
                        System.out.println("Novo saldo: " + saldo);
                    }else{
                        System.out.println("O depósito não pode ser negativo!");
                    }

                    break;

                case  3:
                    System.out.println("Fale um valor do saque: ");
                    float saque = teclado.nextFloat();

                    if(saldo >=saque){
                        saldo = saldo - saque;
                        System.out.println("Novo saldo: " + saldo);
                    }else{
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                default:
                    System.out.println("opção inválida");
            }
        }while(op != 4);
        System.out.println("programa encerrado.");
    }
}
