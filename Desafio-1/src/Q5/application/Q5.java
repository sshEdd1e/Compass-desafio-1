package Q5.application;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        checaPalindromo(str);
    }

    public static void checaPalindromo(String str){
        String temp = str.toLowerCase();
        for (int i = 0; i < temp.length()/2; i++) {
            if (!(temp.charAt(i) == temp.charAt(temp.length() - 1 - i))){
                System.out.println("Não é um palíndromo");
                return;
            }
        }
        System.out.println("É um palíndromo");
    }
}
