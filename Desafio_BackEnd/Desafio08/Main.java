public class Main {
        public static void main(String[] args) {
            int[] V1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] V2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};

            for (int i = 0; i < V1.length; i++) {
                int resultado = V1[i] * V2[i];
                System.out.println((i+1) + "- O resultado da multiplicação do V1 pelo correspondente V2 é: " + resultado);
            }
        }
    }