package IVOrientacaoObjetos.Heranca.Interface;

public class Computador implements Maquina, Teste {

    @Override
    public void teste() {
        System.out.println("Ligar");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar");
    }

    @Override
    public void teste2() {
        System.out.println("Teste2");
    }
}
