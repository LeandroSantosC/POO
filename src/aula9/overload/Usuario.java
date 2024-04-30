package aula9.overload;

public record Usuario(String valor) {
    public Usuario(String valor) {
       this.valor = valor;
    }
 
    public String valor() {
       return this.valor;
    }
 }
 