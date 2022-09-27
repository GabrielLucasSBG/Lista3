import Exercicio.Exercicio;
import Exercicio.Produto;

public class Main {
    public static void main(String args[]) {

        Exercicio carrinho = new Exercicio(10);

        Produto p1 = new Produto("Arroz", "Arroz branco", 5, 20);
        Produto p2 = new Produto("Carne", "Picanha", 1, 60);
        Produto p3 = new Produto("Leite", "Leite piracanjuba", 2, 10);
        Produto p4 = new Produto("Cafe", "Cafee tres coracoes", 2, 15);
        Produto p5 = new Produto("Feijao", "Feijao carioca", 1, 19);
        Produto p6 = new Produto("Queijo", "Queijo redondo", 1, 25);
        Produto p7 = new Produto("Presunto", "Presunto sadiia", 9, 60);
        Produto p8 = new Produto("Pao", "Pao de forma", 3, 20);
        Produto p9 = new Produto("Manteiga", "Manteiga helmans", 1, 10);
        Produto p10 = new Produto("Salsicha", "Salsicha para cachorro quente", 1, 5);

        carrinho.Inserir(p1);
        carrinho.Inserir(p2);
        carrinho.Inserir(p3);
        carrinho.Inserir(p4);
        carrinho.Inserir(p5);
        carrinho.Inserir(p6);
        carrinho.Inserir(p7);
        carrinho.Inserir(p8);
        carrinho.Inserir(p9);
        carrinho.Inserir(p10);

        carrinho.Imprimir();

        System.out.println("Removendo Item 3 da lista");

        carrinho.Remover(3);

        carrinho.Imprimir();

        System.out.println("Esvaziando lista");

        carrinho.LimparLista();

        carrinho.Imprimir();
    }
}