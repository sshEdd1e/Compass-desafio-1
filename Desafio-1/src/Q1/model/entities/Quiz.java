package Q1.model.entities;

import Q1.model.exceptions.DomainException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

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

    public int questiona(int i){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        char resp;
        printaPergunta(i);
        resp = sc.next().charAt(0);
        if (Character.toLowerCase(respostasCertas.get(i)) == Character.toLowerCase(resp)) {
            System.out.println("\nRespota correta!\n");
            cont++;
        } else if (resp < Character.toLowerCase(respostasCertas.get(i)) || resp > Character.toLowerCase(respostasCertas.get(i))) {
            throw new DomainException("Opção inválida!");
        }else {
            System.out.println("\nRespota errada!\n");
        }
        return cont;
    }

    public int getNumPerguntas(){
        return perguntas.size();
    }
}
