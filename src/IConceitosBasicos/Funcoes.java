package IConceitosBasicos;

public class Funcoes {
    private void hellowWord(){
        System.out.println("Olá mundo");

    }

    private Integer soma(int a, int b){
        return a + b;
    }

    private float calculo(float x, float y, float z) {
        return ((x + y) * x) / z;
    }

    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        funcoes.hellowWord();

        System.out.println(funcoes.soma(1, 1));
        System.out.println(funcoes.calculo(23f, 7f, 33.2f));


        String str = "   Curso de Java!  ";

        //Pega o char pela posicao
        str.charAt(2);

        //Verifica se a string é igual
        System.out.println(str.equals("Curso de Java!"));

        //Começa com
        System.out.println(str.startsWith("Curso"));
        System.out.println(str.startsWith("Java"));

        //Termina com
        System.out.println(str.endsWith("Curso"));
        System.out.println(str.endsWith("Java"));

        //Retorna a string que começa com o indice até o final ou até outro indice
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 5));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str);
        System.out.println(str.trim());

        System.out.println(str.length());
    }
}
