
// import static org.junit.jupiter.api.Assertions.assertEquals;
/* Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de
comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas
casas decimais. */
// import org.junit.jupiter.api.Test;
import java.util.Scanner; // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner vendedor = new Scanner(System.in); // nome do vendedor
    System.out.println("Digite o nome do vendedor: ");

    Scanner salario = new Scanner(System.in); // salario fixo
    System.out.println("Digite o salario fixo: R$ ");

    Scanner vendas = new Scanner(System.in); // total de vendas
    System.out.println("Digite o total de vendas: ");

   
    String userName = vendedor.nextLine();
    Float userSalario = salario.nextFloat();
    Float userVendas = vendas.nextFloat();
    Float comissao = userVendas * 0.15f;
    Float total = userSalario + comissao;
    System.out.printf("O vendedor " + userName + " recebeu R$ " + "%.2f", total);
    
  }
}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }
