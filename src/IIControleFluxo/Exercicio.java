package IIControleFluxo;

public class Exercicio {
    private void fatorial(int n){
        int fat = 1;

        for(int i = 1; n >= i; i++){
            fat *=  n * i;
            n--;
        }
        System.out.println(fat);
    }

    private void reverterString(String s){
        String revertido = "";
        for(int i = s.length() - 1; i >= 0; i--){
            revertido += s.charAt(i);
        }

        System.out.println(revertido);
    }

    public static void main(String[] args) {
        Exercicio ex = new Exercicio();
        ex.fatorial(3);
        ex.reverterString("leticia");
    }
}
