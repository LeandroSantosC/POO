package aula10;

public interface Presenteavel {

    double calcularPresente();

    //default quer dizer concreto em uma interface
    default void mostrarInfo(){
        System.out.println("Interface presenteavel");
    }

}
