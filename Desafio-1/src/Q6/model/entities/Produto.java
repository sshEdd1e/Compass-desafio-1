package Q6.model.entities;

public class Produto {
    private String nome;
    private int codigo;
    private float preco;
    private int quantidadeEstoque;

    public Produto() {
    }

    public Produto(String nome, int codigo, float preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void compraProduto(int quant){
        quantidadeEstoque += quant;
    }

    public void vendeProduto(int quant){
        if (quant <= quantidadeEstoque){
            quantidadeEstoque -= quant;
        }
    }

    @Override
    public String toString() {
        return "Produto{" + '\n' +
                "  nome: " + nome + '\n' +
                "  codigo: " + codigo + '\n' +
                "  preco: " + preco + '\n' +
                "  quantidadeEstoque: " + quantidadeEstoque + '\n' +
                '}';
    }
}
