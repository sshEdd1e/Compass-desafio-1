package Q3.application;

import Q1.model.exceptions.DomainException;
import Q3.model.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de funcionarios: ");
        int j = sc.nextInt();

        for (int i = 0; i < j; i++) {
            try {
                sc.nextLine();
                System.out.print("Digite o nome do funcionario: ");
                String tempNome = sc.nextLine();
                System.out.print("Digite o salario do funcionario: ");
                double tempSal = sc.nextDouble();
                Funcionario tempFunc = new Funcionario(tempNome, tempSal);
                funcionarios.add(tempFunc);
            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Digite novamente.");
                i--;
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Digite novamente.");
                i--;
            }
        }

        funcionarios.forEach((n) -> n.calculaBonus());
    }
}
