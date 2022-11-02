package IIControleFluxo;

public class Fluxo {
    private void maiorIdade(int idade) {
        if (idade >= 18) {
            System.out.println(idade + " => Maior de idade");
        } else {
            System.out.println(idade + " => Menor de idade");
        }

    }

    private boolean maiorIdadeBoolean(int idade) {
        return idade >= 18;
    }

    private static void bonus(int anosEmpresa) {
        // 1 - 200
        // 2 - 3 - 500
        // 4 - 5 - 1000
        // >5 - 2000

        if(anosEmpresa <= 1){
            System.out.println("R$200,00");
        } else if(anosEmpresa == 2 || anosEmpresa == 3){
            System.out.println("R$500,00");
        } else if(anosEmpresa == 4 || anosEmpresa == 5){
            System.out.println("R$1000,00");
        } else {
            System.out.println("R$2000,00");

        }
    }

    private String maiorDeIdadeTernario(int idade){
        return idade >= 18 ? ("Maior de idade") : "Menor de Idade";
    }

    public static void main(String[] args) {
        Fluxo fluxo = new Fluxo();
        fluxo.maiorIdade(10);
        fluxo.maiorIdade(20);

        System.out.println(fluxo.maiorIdadeBoolean(20));

        fluxo.bonus(1);
        System.out.println(fluxo.maiorDeIdadeTernario(1));

    }
}
