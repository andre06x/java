package IVOrientacaoObjetos.Heranca;

import IVOrientacaoObjetos.Objetos.Pessoa;

public class Funcionario extends Pessoa {
    public Funcionario(int ano) {
        super(ano);
    }

    @Override
    public void dormir() {
        super.dormir();
        System.out.println("Trabalhei 8 horas");
    }

    public static void main(String[] args) {
        Funcionario func = new Funcionario(1);
        func.dormir();
        System.out.println(func.getAnoNascimento());
    }


}
