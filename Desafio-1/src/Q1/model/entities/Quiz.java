package Q1.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<String> perguntas = new ArrayList<>();
    private List<String[]> opcoes = new ArrayList<>();
    private List<Character> respostasCertas = new ArrayList<>();

    public Quiz() {
    }

    public Quiz(String pergunta, String[] opcao, char respostaCerta) {
        this.perguntas.add(pergunta);
        this.opcoes.add(opcao);
        this.respostasCertas.add(respostaCerta);
    }

    public void removePergunta(int i){
        this.perguntas.remove(i);
        this.opcoes.remove(i);
        this.respostasCertas.remove(i);
    }

    public void addPergunta(String pergunta, String[] opcao, char respostaCerta){
        this.perguntas.add(pergunta);
        this.opcoes.add(opcao);
        this.respostasCertas.add(respostaCerta);
    }
    
    private void printaPergunta(int i){
        System.out.println(perguntas.get(i));
        char letra = 65;
        for (int j = 0; j < opcoes.get(i).length; j++) {
            System.out.println(letra + ") " + opcoes.get(i)[j]);
            letra++;
        }
    }

    public int questiona(){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        for (int i = 0; i < perguntas.size(); i++) {
            printaPergunta(i);
            if (Character.toLowerCase(respostasCertas.get(i)) == Character.toLowerCase(sc.next().charAt(0))) {
                System.out.println("\nRespota correta!\n");
                cont++;
            } else {
                System.out.println("\nRespota errada!\n");
            }
        }
        return cont;
    }

    public int getNumPerguntas(){
        return perguntas.size();
    }
}
