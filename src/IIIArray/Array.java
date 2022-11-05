package IIIArray;

public class Array {
    public static void main(String[] args) {
        float[] notas = new float[5];

        long numeros[] = {1,2,3,4,5,6,7,8};

        for(int i = 0; i < notas.length; i++){
            notas[i] = i * 2;
        }

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }
}
