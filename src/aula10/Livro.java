package aula10;

public class Livro extends Produto implements Presenteavel {
    

    public Livro(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double descontar(){
        return 0.8*getPreco();
    }


    @Override
    public double calcularPresente(){
        return 0.95*getPreco();
    }

}
