package aula10;

public class polimorfismo {

    public static void main(String[] args) {
        // O polimorfismo de subtipos faz com  que a linha abaixo compile sem problemas
        // Livro < Produto
        Produto p = new Livro("HP", 50);
         
        // Em tempo de compilação, não é possivel para p enxergar o método calcularPresente.
        // pois o java acha que p é produto mesmo que p seja instaciado como tal.
        // O java só sabera que p é livro quando a linha 8 for executada.
        System.out.println(p.descontar());

        Livro l = new Livro("Pai rico, pai pobre", 70);

        Escolar e = new Escolar("Caneta", 0.5);

        Eletronico k = new Eletronico("Iphone 15", 5000);

        Carrinho c = new Carrinho();
        c.adicionar(p);
        c.adicionar(l);
        c.adicionar(e);
        c.adicionar(k);
        c.listar();
    }
}
