package aula9.override;

public class Retangulo extends Quadrilatero{

    private double lado2;

    public Retangulo(double lado, double lado2){
        super(lado);
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea(){
        return lado*lado2;
    }

    @Override
    public double calcularPerimetro(){
        return 2*(lado + lado2);
    }
}
