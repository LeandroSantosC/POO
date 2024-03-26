package aula6;

public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Livro 1", Tipo.ESCOLAR,60);
        Produto p2 = new Produto("Livro 2", Tipo.ESCOLAR,60);
        Produto p3 = new Produto("Caneta", Tipo.ESCRITORIO,20);
        Produto p4 = new Produto("Pen Drive", Tipo.TECNOLOGIA,50);
        Produto p5 = new Produto("Disquete", Tipo.TECNOLOGIA,15);
        Carrinho c = new Carrinho(4);

        c.inserir(p1);
        c.inserir(p2);
        c.inserir(p3);
        c.inserir(p4);
        c.remover(1);
        c.inserir(p5);
        c.listar();
        System.out.println(c.calcularTotal());
        System.out.println(c.mediaPrecoProdutos());
        c.busca("Caneta");

    }
}
