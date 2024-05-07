package aula10;

public class Escolar extends Produto implements Presenteavel, Taxavel{

    public Escolar(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double descontar(){
        return 0.85*getPreco();
    }

    @Override
    public double calcularPresente(){
        return 0.97*getPreco();
    }

    @Override
    public double calcularTributo(){
        return 1.2*getPreco();
    }

}
