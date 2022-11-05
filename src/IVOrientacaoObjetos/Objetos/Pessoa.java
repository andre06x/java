package IVOrientacaoObjetos.Objetos;

public class Pessoa {
    private String nome;
    public Integer anoNascimento;
    public Endereco endereco;

    public Pessoa(int ano){
        this.anoNascimento = ano;
        this.nome = "";
        this.endereco = new Endereco();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void dormir(){
        System.out.println("Estou dormindo");
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento){
        if(anoNascimento < 0){
            this.anoNascimento = 0;
        }

        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }
}
