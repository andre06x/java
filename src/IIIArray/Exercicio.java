package IIIArray;

public class Exercicio {
    public void Exercicio1() {
        String nomes[] = {"Natasha Alianovna Romanoff", "Stephen Vincent Strange", "Anthony Edward Stark"};
        int indinceMaior = 0;
        int numeroChar = 0;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].length() > numeroChar) {
                indinceMaior = i;
                numeroChar = nomes[i].length();
            }
        }

        System.out.println("A maior String é " + nomes[indinceMaior]);
    }

    public void Exercicio2(float[] arr) {
        int soma = 0;

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                soma += arr[i];
            }

            System.out.println("A media é dos valores é =>" + soma / arr.length);

        } else {
            System.out.println("Número inválido");

        }

    }

    public static void main(String[] args) {
        Exercicio exercicio = new Exercicio();
        exercicio.Exercicio1();

        float valores[] = {14f, 5.3f, 63.5f, 34f, 15f};
        float valores2[] = {};
        float valores3[] = null;

        exercicio.Exercicio2(valores);
        exercicio.Exercicio2(valores2);
        exercicio.Exercicio2(valores3);

    }
}
