package Q4.application;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrada: ");
        String str = sc.nextLine();

        checaSentimento(str);
    }

    static void checaSentimento(String str){
        int humor = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ':'){
                if (str.charAt(i+1) == '-'){
                    if (str.charAt(i+2) == ')'){
                        humor++;
                    } else if (str.charAt(i+2) == '(') {
                        humor--;
                    }
                }
            }
        }
        if (humor > 0){
            System.out.println("Saída: divertido");
        } else if (humor < 0){
            System.out.println("Saída: chateado");
        } else {
            System.out.println("Saída: neutro");
        }
    }
}
