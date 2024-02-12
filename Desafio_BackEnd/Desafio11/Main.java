/* Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência,
calcule e mostre:
a. o valor de cada quilowatt;
b. o valor a ser pago por essa residência;
c. o valor a ser pago com desconto de 15%. */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner salarioMinimo = new Scanner(System.in);
    System.out.printf("Informe o valor do salário mínimo: ");
    Double salario = salarioMinimo.nextDouble();
 
    Scanner quantidade_quilowatt = new Scanner(System.in);
    System.out.printf("Informe a quantidade de quilowwatt: ");
    Double quilowatt = quantidade_quilowatt.nextDouble();
    
    double preco_quilowatt = salario / 5;
    double valor_pago = preco_quilowatt * quilowatt;
    double valor_desconto = valor_pago * 0.15;    
    
    System.out.println("O valor de cada quilowatt é: R$ " + preco_quilowatt);
    System.out.println("O valor a ser pago é: R$ " + valor_pago);
    System.out.println("O valor com desconto: R$ " + valor_desconto);
  }
}