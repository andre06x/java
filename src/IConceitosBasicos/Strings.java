package IConceitosBasicos;

public class Strings {
    public static void main(String[] args) {
        String nome = "Java";

        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(1));
        System.out.println(nome.charAt(2));
        System.out.println(nome.charAt(3));

        System.out.println(nome + " " + "dasdasdsa");
        Integer idade = 10;

        System.out.println("Idade: " + idade);

        //Convertendo um double para string
        Double d = 1043860.9;
        String strDouble = String.valueOf(d);

        System.out.println(strDouble);

    }
}
