package aula9.exercicio1;

// Implemente a classe sitio que possua os métodos alinhados com cada menu de um site.
// - Site possui 3 menus: principal, dashboard e painel.
// - Admin acessa a página principal e o painel (mostre mensagem na tela apenas)
// - Usuario acessa o principal e o dashboard
// - Convidado acessa apenas o painel
// - Todo acesso negado deve dar erro.
// - Use classe abstrata e sobrescrita.

public class exercicio1 {

    public static void main(String[] args) {
        Admin a = new Admin();

        a.dashboard();
        a.principal();
        a.painel();
    }
}
