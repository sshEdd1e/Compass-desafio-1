package Q6.application;

import Q6.model.entities.Produto;

public class Q6 {
    public static void main(String[] args) {
        Produto prod = new Produto("Bussola", 1995, 1300.00f, 50);

        System.out.println(prod);

        prod.compraProduto(50);

        System.out.println(prod);

        prod.vendeProduto(42);

        System.out.println(prod);
    }
}
