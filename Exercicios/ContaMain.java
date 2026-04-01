import java.util.Scanner;
public class ContaMain {
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Sistema bancário");

                Conta c1 = new Conta (null, 0);

                System.out.println("Digite o nome do titular: ");
                c1.titular = teclado.nextLine();

                System.out.println("Deposite um valor na conta: ");
                double valor = teclado.nextDouble();

                c1.Depositar(valor);
                c1.VerSaldo();

                teclado.nextLine();

            System.out.println("Deseja realizar um saque? S/n");
            String op = teclado.nextLine();

            switch (op){
                case "S":
                    System.out.println("Digite o valor do saque: ");
                    double saque = teclado.nextDouble();

                    c1.Sacar(saque);
                    break;

                case "n":
                    c1.VerSaldo();
                    break;

                default:
                    System.out.println("Processo finalizado.");
            }

        }
    }

