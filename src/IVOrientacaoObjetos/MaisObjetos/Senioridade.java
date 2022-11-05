package IVOrientacaoObjetos.MaisObjetos;

public enum Senioridade {
    JUNIOR(1), PLENO(3), SENIOR(7);

    public int valor;

    Senioridade(int id){
        this.valor = id;
    };

    public int getId(){
        return this.valor;
    }

}
