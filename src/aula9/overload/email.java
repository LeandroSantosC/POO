package aula9.overload;

public record email(String valor) {
    public email(String valor) {
       this.valor = valor;
    }
 
    public String valor() {
       return this.valor;
    }
 }
 
