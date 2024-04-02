package simulado.exercicio1;

// Exercı́cio 1. Um passageiro possui nome e pode ser estudante ou não. Em
// um ônibus, passageiros podem ser alocados no sistema de compra de passagem
// ao ônibus. O preço da passagem é definido para cada ônibus e sabe-se que um
// passageiro estudante paga meia. O sistema pode listar os passageiros, listar os
// estudantes apenas e calcular o total de venda de passagens.
// (a) Esboce um diagrama de classes;
// (b) Implemente as classes e escreva um pequeno teste.

public class Passageiro {

    private String nome;
    private boolean estudante;

    public Passageiro(String nome, boolean estudante){
        this.nome = nome;
        this.estudante = estudante;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEstudante(){
        return estudante;
    }

}
