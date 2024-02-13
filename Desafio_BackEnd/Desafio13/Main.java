/*Faça um programa que receba três notas e seus respectivos pesos,
calcule e mostre a média ponderada dessas notas. Para calcular a
média ponderada, multiplique cada nota por seus respectivos pesos,
some todos os resultados e divida pela soma dos pesos. Por exemplo,
se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do
estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38.
Esse valor deve ser dividido pela soma dos pesos (6), resultando em
6,3.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double peso1 = 1;
      double peso2 = 2;
      double peso3 = 3;
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;

        System.out.printf("A média ponderada é: %.2f", mediaPonderada);
    }
}
