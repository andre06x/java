package VColecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue filaClientes = new LinkedList();
        filaClientes.add("X1");
        filaClientes.add("X2");
        filaClientes.add("X3");

        filaClientes.poll();
        System.out.println(filaClientes);;
    }
}
