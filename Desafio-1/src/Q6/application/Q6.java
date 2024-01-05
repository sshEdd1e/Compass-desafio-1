package Q6.application;

import Q6.model.entities.Produto;

public class Q6 {
    public static void main(String[] args) {
        Produto prod = new Produto("Bussola", 1995, 1300.00f, 50);

        System.out.println(prod);

        prod.compraProduto(50);

        System.out.println(prod);
        try {
            prod.vendeProduto(42);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println(prod);
    }
}
