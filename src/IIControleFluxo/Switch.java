package IIControleFluxo;

public class Switch {
    private void bonus(String cargo) {
        switch (cargo){
            case "Gerente": {
                System.out.println("Cargo Gerente!");
                break;
            }
            case "Supervisor":{
                System.out.println("Cargo Surpervisor!");
                break;
            }
            case "Técnico":{
                System.out.println("Cargo Técnico!");
                break;
            }

            default: {
                System.out.println("Cargo inválido!");
            }
        }
    }

    public static void main(String[] args) {
        Switch st = new Switch();
        st.bonus("dsadad");

    }
}
