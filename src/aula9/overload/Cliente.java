package aula9.overload;

public class Cliente {
    private String nome;
    private int idade;
 
    public Cliente() {
       this.nome = "Secreto";
       this.idade = 19;
    }
 
    public Cliente(int idade) {
       this.idade = idade;
    }
 
    public Cliente(String nome) {
       this.nome = nome;
    }
 
    public Cliente(String nome, int idade) {
       this.nome = nome;
       this.idade = idade;
    }
 
    public Cliente(int idade, String nome) {
       this.nome = nome;
       this.idade = idade;
    }
 }