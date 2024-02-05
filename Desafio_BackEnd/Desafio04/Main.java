// import static org.junit.jupiter.api.Assertions.assertEquals;
/* Escreva um programa que realize a conversão de graus Celsius (C) para graus Fahrenheit
(F). Utilize a fórmula abaixo:
F = ( 9 * C) / 5
*/  
// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner temp = new Scanner(System.in);
    System.out.println("Digite a temperatura em Celsius: ");

    Float C = temp.nextFloat();
    Float F = (C * 9/5) + 32;
    System.out.println("A temperatura em Fahrenheit é " + F);
  }
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
