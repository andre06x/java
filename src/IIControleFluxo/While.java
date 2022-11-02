package IIControleFluxo;

public class While {
    public static void main(String[] args) {
        int i = 0;

        while(i < 10){
            i++;

            if(i == 5){
                break;
            }
            System.out.println(i);

        }

        i = 0;

        do {
            i++;
            System.out.println(i);
            if(i == 5){
                break;
            }
        } while ( i < 10);
    }
}
