package simulado.exercicio1;

public enum Destino {
    SAOVICENTE(4.60), SANTOS(4.80), CUBATAO(5.00), GUARUJA(5.50), PERUIBE(10.50), MONGAGUA(8.00);
    
    private double valorPassagem;
    
    Destino(double valor){
        valorPassagem = valor;
    }
    
    public double getValorPassagem(){
        return valorPassagem;
    }
}
