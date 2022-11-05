package IVOrientacaoObjetos.Objetos;

public class Exercicio {
    private float saldo;

    public Exercicio() {
        this.saldo = 50000;
    }

    public void saque(float valor) throws Exception {

        if (valor <= 0) {
            throw new Exception("Não é possível sacar um valor negativo.");
        }

        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado.");
        } else {
            throw new Exception("Saldo insuficiente");
        }

    }

    public void recarga(float valorRecarga) throws Exception {

        if (valorRecarga <= 0) {
            throw new Exception("Não é possível recarregar com um valor zero ou negativo.");
        }
        saldo += valorRecarga;

    }

    public static void main(String[] args) {
        Exercicio caixa = new Exercicio();

        try {

            caixa.saque(100);
            caixa.saque(3000);

            caixa.recarga(1000);
            caixa.saque(1000000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

