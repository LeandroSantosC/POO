package aula10;

public class Main {

    public static void main(String[] args) {
        Livro l = new Livro("Harry Potter", 55);
        l.mostrar();
        System.out.println(l.descontar());
        System.out.println(l.calcularPresente());

        Escolar e = new Escolar("Caderno", 10);
        System.out.println(e.calcularTributo());
        System.out.println(e.calcularPresente());
        System.out.println(e.descontar());
        e.mostrar();


    }
}
