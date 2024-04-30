package aula9.overload;

public class main {
 
    public static void main(String[] args) {
       if (validador.validar(new Usuario("aaa")) && validador.validar(new email("a@b.com"))) {
          System.out.println("Valido");
       } else {
          System.out.println("Invalido");
       }
    }
 }
 