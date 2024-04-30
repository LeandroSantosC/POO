package aula9.override;

public abstract class Quadrilatero {

    protected double lado;

    public Quadrilatero(double lado){
        this.lado = lado;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
