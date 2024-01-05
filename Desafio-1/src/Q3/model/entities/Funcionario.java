package Q3.model.entities;

import Q1.model.exceptions.DomainException;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        if (!(nome.contains(" "))){
            throw new DomainException("Favor digite o nome completo!");
        }
        if (salario < 0){
            throw new DomainException("Salario não pode ser negativo!");
        }
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!(nome.contains(" "))){
            throw new DomainException("Favor digite o nome completo!");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0){
            throw new DomainException("Salario não pode ser negativo!");
        }
        this.salario = salario;
    }

    public void calculaBonus(){
        if (salario <= 1000){
            System.out.println(toString());
            System.out.println("• Bonus: " + (salario * 0.20d));
            System.out.println("• Salario liquido: " + (salario * 1.20d));
        } else if (salario < 2000) {
            System.out.println(toString());
            System.out.println("• Bonus: " + (salario * 0.10d));
            System.out.println("• Salario liquido: " + (salario * 1.10d));
        } else {
            System.out.println(toString());
            System.out.println("• Desconto: " + (salario * 0.10d));
            System.out.println("• Salario liquido: " + (salario * 0.90d));
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "• Funcionário " + nome + '\n' +
                "• Salario: " + salario;
    }
}
