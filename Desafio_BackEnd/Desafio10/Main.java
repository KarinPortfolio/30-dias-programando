/* Escreva um programa que leia um vetor de 10 números inteiros e, em seguida, imprima este
vetor na ordem inversa.
Entrada:
A entrada consiste em 10 números inteiros, cada um em uma linha separada.
Saída:
A saída deve ser os 10 números inteiros dados como entrada, mas na ordem inversa, cada um
em uma linha separada. */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
      System.out.println("Digite 10 números: " );

        // Lê os 10 números inteiros
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Imprime o vetor na ordem inversa
        for (int i = 9; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}