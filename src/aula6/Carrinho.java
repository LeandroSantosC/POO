package aula6;

public class Carrinho {

    private Produto[] produtos;

    public Carrinho(int tamanho){
        produtos = new Produto[tamanho];
    }

    public void inserir(Produto p){
        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                produtos[i] = p;
                return;
            }
        }
        System.out.println("Carrinho cheio!");
    }

    public void remover(int i){
        if(i < 0 || i >= produtos.length){
            System.out.println("Error");
            return;
        }
        produtos[i] = null;
    }

    public void listar(){
        for(int i = 0; i < produtos.length; i++){
            System.out.println("--------- item " + (i+1) + "---------");
            produtos[i].mostrar();
        }
    }

    public double calcularTotal(){
        double soma = 0;

        for(int i = 0; i < produtos.length; i++){
            soma += produtos[i].valor();
        }

        return soma;
    }

    public double calcularTotalComFiltro(Tipo tipo){
        double soma = 0;

        for(int i = 0; i < produtos.length; i++){
            if(tipo == produtos[i].tipo()){
                soma += produtos[i].valor();
            }
        }

        return soma;
    }

    public double mediaPrecoProdutos(){
        return calcularTotal()/produtos.length;
    }

    public void busca(String nome){
        boolean houveResultado = false;
        System.out.println("-------- RESULTADO BUSCA ---------");
        for(int i = 0; i < produtos.length; i++){
            if (nome == produtos[i].getNome()){
                produtos[i].mostrar();
                System.out.println("----------------------------------");
                houveResultado = true;
            }
        }
        if(!houveResultado){
            System.out.println("NENHUM DADO ENCONTRADO");
            System.out.println("----------------------------------");
        }
    }
}
