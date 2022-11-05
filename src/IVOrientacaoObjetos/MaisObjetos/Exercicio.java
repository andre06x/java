package IVOrientacaoObjetos.MaisObjetos;

public class Exercicio {
    enum DIAS {
        SEGUNDA(1),
        TERCA(2),
        QUARTA(3),
        QUINTA(4),
        SEXTA(5),
        SABADO(6),
        DOMINGO(7);

        private int id;

        DIAS(int id) {
            this.id = id;
        }

        static String getDescricaoById(int id) throws Exception {
            for (DIAS dia : values()) {
                if (dia.id == id) {
                    return dia.name();
                }
            }

            throw new Exception("Valor inválido");
        }

    }

    private static String descricaoSemanal(int[] dias) {
        try {

            if (dias == null || dias.length == 0) {
                return "Alarme não configurado";
            } else if (dias.length == 2 && (dias[0] + dias[1]) == 13) {
                return "Final de semana";
            } else if (dias.length == 7) {
                return "Todos os dias";
            } else {
                StringBuilder str = new StringBuilder();
                for (int i = 0; i < dias.length; i++) {
                    str.append(DIAS.getDescricaoById(dias[i]));

                    if (i != dias.length - 1) {
                        str.append(", ");
                    }
                }
                return str.toString();
            }

        } catch (Exception e) {
            return e.getMessage();
        }

    }

    public static void main(String[] args) {

        int[] dias1 = null;
        int[] dias2 = {};
        int[] dias3 = {DIAS.SABADO.id, DIAS.DOMINGO.id};
        int[] dias4 = {DIAS.SEGUNDA.id, DIAS.TERCA.id};
        int[] dias5 = {DIAS.SEGUNDA.id, DIAS.TERCA.id, DIAS.QUARTA.id, DIAS.QUINTA.id, DIAS.SEXTA.id};

        System.out.println(descricaoSemanal(dias1));
        System.out.println(descricaoSemanal(dias2));
        System.out.println(descricaoSemanal(dias3));
        System.out.println(descricaoSemanal(dias4));
        System.out.println(descricaoSemanal(dias5));

    }
}
