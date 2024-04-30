package aula9.abstrato;

public abstract class Animal {

    protected String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public abstract void emitirSom();

    public void respirar(){
        System.out.println("HMPPPF");
    }

}
