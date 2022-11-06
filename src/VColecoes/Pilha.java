package VColecoes;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
       Stack pilha = new Stack();
       pilha.push(124);
       pilha.push("dsldakdçlasd");

        System.out.println(pilha.pop());
        System.out.println(pilha.peek());
        System.out.println(pilha.size());

    }
}
