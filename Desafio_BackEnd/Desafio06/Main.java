import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final String login = "usuario";
    final String senha = "1234";

    Scanner digitar = new Scanner(System.in);
    String user, pass;

    while (true) {
      System.out.println("Digite o usuário: ");
      user = digitar.nextLine();

      System.out.println("Digite a senha: ");
      pass = digitar.nextLine();

      if (login.equals(user) && senha.equals(pass)) {
        System.out.println("ACESSO CONCEDIDO");
        break;
      } else {
        System.out.println("ACESSO NEGADO");
      }
    }
    digitar.close();
  }
}