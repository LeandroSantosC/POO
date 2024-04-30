package aula9.abstrato;

public class Gato extends Animal{

    //Assinatura = nome + Lista de Parametro
    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + ": MIAU");
    }
}
