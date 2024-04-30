package aula9.exercicio1;

public class Convidado extends Sitio{

    @Override
    public void principal(){
        System.out.println("Não pode");
    }

    @Override
    public void dashboard(){
        System.out.println("Não pode");
    }

    @Override
    public void painel(){
        System.out.println("Faça o login");
    }
}

