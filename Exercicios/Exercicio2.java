import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Você tem  apenas 3 chances para acertar usuario e senha!");
        boolean logado = false;


        for (int i = 0; i < 3; i++) {

            System.out.println("Tentativa " + (i + 1) + " de 3");

            System.out.println("Digite seu usuário(admin): ");
            String usuario = teclado.nextLine();

            System.out.println("Digite sua senha(1234): ");
            String senha = teclado.nextLine();

            if (usuario.equals("admin") && senha.equals("1234")) {
                System.out.println("Login realizado");
                logado = true;
                break;
            } else {
                int restantes = 2 - i;
                if (restantes > 0) {
                    System.out.println("Usuário ou senha incorretos!");
                    System.out.println("Tentativas restantes: " + restantes);
                }

            }

        }
        if (!logado) {
            System.out.println("Acesso bloqueado após 3 tentativas!");
        }
    }
}