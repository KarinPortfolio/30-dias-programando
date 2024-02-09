/* Elaborar um programa que apresente o somatório dos números na faixa de 1 até 500. */
public class Main {
    public static void main(String[] args) {
        int somatorio = 0;

        for (int i = 1; i <= 500; i++) {
              somatorio += i; // Adicionando cada número à soma
        }

        System.out.println("O somatório de 1 a 500 é: " + somatorio);
    }
}