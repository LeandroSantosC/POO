package simulado.exercicio1;

public class Onibus {

    private Passageiro[] assentos;
    private Destino destino;

    public Onibus(Destino destino, int assentos){

        this.destino = destino;
        this.assentos = new Passageiro[assentos];

    }

    public void alocarPassageiro(Passageiro passageiro){
        for(int i = 0; i < assentos.length; i++){
            if(assentos[i] == null){
                assentos[i] = passageiro;
                return;
            }
        }
        System.out.println("Onibus lotado!");
    }

    public void removerPassageiro(Passageiro passageiro){
        for(Passageiro assento : assentos){
            if(assento == passageiro){
                assento = null;
                return;
            }
        }
        System.out.println("Passageiro" + passageiro.getNome() + "não encontrado!");
    }

    public void listarPassageiros(){
        for(Passageiro assento : assentos){
            if(assento != null){
                System.out.println(assento.getNome());
            }
        }
    }

    public void listarEstudantes(){
        for(Passageiro assento : assentos){
            if(assento != null){
                if(assento.isEstudante()){
                    System.out.println(assento.getNome());
                }
            }
        }
    }

    public double calcularTotalPass(){
        double soma = 0;
        for(Passageiro assento : assentos){
            if(assento == null){
                continue;
            }
            if(assento.isEstudante()){
                soma += destino.getValorPassagem()/2;
            }
            else if(assento != null){
                soma += destino.getValorPassagem();
            }
        }
        return soma;
    }
}
