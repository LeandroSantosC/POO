package aula9.override;

public class Quadrado extends Quadrilatero{

    public Quadrado(double lado){
        super(lado);
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }
}
