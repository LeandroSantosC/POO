package aula10;

import java.util.ArrayList;

//Carrinho HAS-MANY Livro
public class Carrinho {

    private ArrayList<Produto> ps;

    public Carrinho(){
        ps = new ArrayList<Produto>();
    }

    public void adicionar(Produto p){
        ps.add(p);
    }

    public void listar(){
        for(Produto p : ps){
            p.mostrar();
        }
    }

    public void mostrarDescontos(){
        //Esse for funciona por causa do polimorfismo de subtipos
        for(Produto p : ps){
            System.out.println(p.descontar());
        }
    }
}
