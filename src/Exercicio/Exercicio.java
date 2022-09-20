package Exercicio;

public class Exercicio {

    int primeiro = 0;
    Produto prim;
    int ultimo = 0;
    int matricula;
    int max;
    private Produto[] Lista_Compras = new Produto[max];

    public Exercicio(int max) {
        this.max = max;
    }

    public boolean vazia() {
        return (this.primeiro == this.ultimo);
    }

    public void Inserir(Produto gabriel) {
        if (this.ultimo >= this.Lista_Compras.length) {
            System.out.println("nao e permitido adicionar");
        } else {
            this.Lista_Compras[this.ultimo] = gabriel;
            this.ultimo = this.ultimo + 1;
            System.out.println("Adicionado");
        }
    }

    public void Imprime(Produto gabriel) {
        for (Produto produtos : Lista_Compras) System.out.println(produtos);
    }

    public void removeItem(String nome) {
        Produto iter = prim;
        if (iter != null) {
            if (iter.getNome().equalsIgnoreCase(nome)) {
                prim = iter.prox;
            } else {
                while (iter.prox != null && !iter.prox.getNome().equalsIgnoreCase(nome)) {
                    iter = iter.prox;
                }
                if (iter.prox != null) {
                    iter.prox = iter.prox.prox;
                }
            }
        }
    }
}