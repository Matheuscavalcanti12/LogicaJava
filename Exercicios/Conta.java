public class Conta {
    String titular;
    double saldo;
    double valor;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }


    public void Depositar(double valor) {
             saldo += valor;
    }

    public void Sacar(double saque){

        if(saque > saldo){
            System.out.println("Dinheiro insuficiente!");
        }else{
            saque = saldo - saque;
        }
    }

    public void VerSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

}

