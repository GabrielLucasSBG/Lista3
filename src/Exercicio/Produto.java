package Exercicio;

public class Produto {
    Produto prox;
    private int quantidade;
    private double valor;
    private String nome;
    private String descricao;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoo() {
        return descricao;
    }

    public void setDescricaoo(String descricao) {
        this.descricao = descricao;
    }

    public Produto(String nome, String descricao, int quantidade, double valorTotal) {
        super();
        this.quantidade = quantidade;
        this.valor = valorTotal;
        this.nome = nome;
        this.descricao = descricao;
    }
}