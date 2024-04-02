package simulado.exercicio1;

public class main {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("Leandro", true);
        Passageiro p2 = new Passageiro("Gabriel", false);
        Passageiro p3 = new Passageiro("Thays", true);
        Passageiro p4 = new Passageiro("Leticia", false);
        Passageiro p5 = new Passageiro("Suzy", false);

        Onibus onibus = new Onibus(Destino.MONGAGUA, 6);

        onibus.alocarPassageiro(p1);
        onibus.alocarPassageiro(p2);
        onibus.alocarPassageiro(p3);
        onibus.alocarPassageiro(p4);
        onibus.alocarPassageiro(p5);
        onibus.alocarPassageiro(p1);

        onibus.listarEstudantes();
        System.out.println("-----------------------");
        onibus.listarPassageiros();
        System.out.println(onibus.calcularTotalPass());
    }

}
