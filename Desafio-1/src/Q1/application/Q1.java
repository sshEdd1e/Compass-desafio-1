package Q1.application;

import Q1.model.entities.Quiz;
import Q1.model.exceptions.DomainException;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        quiz.addPergunta("Em qual ano a Compasso UOL foi fundada?", new String[]{"1994", "1995", "1996", "1997"}, 'c');
        quiz.addPergunta("Quantos funcionários a Compasso UOL contrata?", new String[]{"800", "1300", "3200", "5100"}, 'b');
        quiz.addPergunta("Onde fica a sede da Compasso UOL?", new String[]{"Belo Horizone", "São Paulo", "Barueri", "Jericoacoara"}, 'b');

        int corretas = 0;
        int total = quiz.getNumPerguntas();

        for (int i = 0; i < total; i++) {
            try {
                corretas += quiz.questiona(i);
            } catch (DomainException e) {
                System.out.println("Erro: " + e.getMessage());
                i--;
            }
        }

        System.out.println("Usuário: " + nome);
        System.out.println("Acertos: " + corretas);
        System.out.println("Erros: " + (total-corretas));
    }
}
