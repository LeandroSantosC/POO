package aula7;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
    
        lista.adicionar(4);
        lista.adicionar(5);
        lista.adicionar(6);
        lista.adicionar(7);
        lista.adicionar(8);
        lista.adicionar(9);
        lista.adicionar(10);
        lista.adicionar(5);
        lista.listar();
        lista.contar();
        lista.removerPrimeiro(6);
        System.out.println("--------------------");
        lista.listar();
        lista.contar();
        lista.removerPrimeiro(4);
        System.out.println("--------------------");
        lista.listar();
        lista.contar();
        lista.removerPrimeiro(5);
        System.out.println("--------------------");
        lista.listar();
        lista.contar();
        lista.removerPrimeiro(11);
    }
}
