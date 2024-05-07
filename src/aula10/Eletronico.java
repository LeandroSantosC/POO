package aula10;

public class Eletronico extends Produto implements Taxavel{

    public Eletronico(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double descontar(){
        return 0.85*getPreco();
    }

    @Override
    public double calcularTributo(){
        return 1.5*getPreco();
    }

}
