package aula9.exercicio1;

public class Usuario extends Sitio{

    @Override
    public void principal(){
        System.out.println("Bem vindo usuario");
    }

    @Override
    public void dashboard(){
        System.out.println("Coisas de usuario");
    }

    @Override
    public void painel(){
        System.out.println("Erro 403");
    }
}

