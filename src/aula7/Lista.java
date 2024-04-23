package aula7;

public class Lista {

    private int conteudo;
    private Lista prox;


    public Lista(){

    }

    private Lista (int conteudo){

        this.conteudo = conteudo;

    }



    public void adicionar(int novo){

        Lista aux = this.prox;
        if(aux != null){
            while(aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = new Lista(novo);
            return;
        }
        this.prox = new Lista(novo);

    }

    public void listar(){
        Lista aux = this.prox;
        while(aux != null){
            System.out.println(aux.conteudo);
            aux = aux.prox;
        }
    }

    public int contar(){
        int i = 0;
        Lista aux = this.prox;
        while(aux != null){
            i++;
            aux = aux.prox;
        }
        return i;
    }

    public void removerPrimeiro(int x){
        boolean achou = false;
        Lista aux = this;
        if(aux.prox.conteudo == x){
                aux.prox = aux.prox.prox;
        }
        aux = this.prox;
        while(aux.prox != null){
            if(aux.prox.conteudo != x){
                aux = aux.prox;
            }
            else{
                aux.prox = aux.prox.prox;
                achou = true;
            }
        }
        if(!achou){
            System.out.println("Não há o número " + x + " na lista!");
        }

    }
}