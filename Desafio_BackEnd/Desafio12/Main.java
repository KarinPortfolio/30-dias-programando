/* Elaborar um programa que apresente a sequência de Fibonnacci até o décimo quinto termo. */
public class Main {
    public static void main(String[] args) {
        int n = 15, t1 = 0, t2 = 1;
               for (int i = 1; i <= n; ++i) {
            System.out.print(i + ": " + t1 + "\n");

            int soma = t1 + t2;
            t1 = t2;
            t2 = soma;
        }
    }
}
