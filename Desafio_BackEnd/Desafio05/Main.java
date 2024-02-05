// import static org.junit.jupiter.api.Assertions.assertEquals;
/* Desenvolva um programa que execute a leitura de um valor numérico inteiro, caso o valor esteja
entre 1 e 9 apresentar a mensagem “Dentro do valor permitido” e caso contrário apresentar a
mensagem “Fora do Valor Permitido”. */
// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Digite um número inteiro: ");
    Scanner numero = new Scanner(System.in);
    int num = numero.nextInt();
    if (num > 1 && num < 9){
      System.out.println("Dentro do valor permitido.");
    }
    else{
      System.out.println("Fora do valor permitido!");
    }

  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}