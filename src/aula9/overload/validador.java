package aula9.overload;

public class validador {
   public validador() {
   }

   public static boolean validar(email email) {
      return email.valor().contains("@");
   }

   public static boolean validar(Usuario usuario) {
      return !usuario.valor().equals("");
   }
}
