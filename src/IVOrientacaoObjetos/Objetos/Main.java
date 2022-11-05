package IVOrientacaoObjetos.Objetos;

public class Main {
    public static void main(String[] args) {

        String str;
        Pessoa pessoa = new Pessoa(0);
        pessoa.setNome("Gabriel");
        pessoa.setAnoNascimento(2000);

        Pessoa pessoa2 = new Pessoa(0);
        pessoa2.setAnoNascimento(pessoa.getAnoNascimento());
        pessoa2.setNome("João");

        System.out.println("Pessoa 1 " + pessoa.getNome());
        System.out.println("Pessoa 2 " + pessoa2.getNome());

    }
}
