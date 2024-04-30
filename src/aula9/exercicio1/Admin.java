package aula9.exercicio1;

public class Admin extends Sitio{

    @Override
    public void principal(){
        System.out.println("Bem vindo admin");
    }

    @Override
    public void dashboard(){
        System.out.println("Não pode");
    }

    @Override
    public void painel(){
        System.out.println("Painel admin");
    }
}
