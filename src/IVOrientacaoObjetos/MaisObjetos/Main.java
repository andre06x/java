package IVOrientacaoObjetos.MaisObjetos;

public class Main {
    public static void main(String[] args) {
        System.out.println(Senioridade.JUNIOR.valor);

        for(Senioridade s : Senioridade.values()){
            System.out.println(s.getId());
        }
    }

}
