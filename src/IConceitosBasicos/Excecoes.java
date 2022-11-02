package IConceitosBasicos;

public class Excecoes {
    public static void main(String[] args) {
        try {

            String s = null;
            System.out.println(s.length());

            String str = "Curso de Java";
            str.charAt(100);

        } catch (NullPointerException e) {
            System.out.println("Erro nullPointer ");

        } catch (Exception e) {
            System.out.println("Errou desconhecido " + e);
        } finally {
            System.out.println("Finaly");
        }

    }
}
