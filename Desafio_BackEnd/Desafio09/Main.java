import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    int[] vetores = new int[40];
    int contarPares = 0;

    Scanner ler = new Scanner(System.in);
    for (int inteiro = 0; inteiro < 40; inteiro++){
      System.out.println(inteiro + "- Digite um número inteiro:");
      vetores[inteiro] = ler.nextInt();

      if (vetores[inteiro] % 2 == 0){
        contarPares++;
      }
    }
    System.out.println("Temos " + contarPares + " números pares.");
  }
}
