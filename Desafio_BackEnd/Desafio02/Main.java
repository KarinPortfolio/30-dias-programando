// import static org.junit.jupiter.api.Assertions.assertEquals;
/*  Saber se um aluno foi ou nao aprovado no final do semestre. O usuário dará
entrada em 4 notas (de cada bimestre), e a média tem que ser 60. Se a nota for menor, mostrar
que o aluno foi reprovado, se for maior ou igual a 60, mostrar que foi aprovado. */ 
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    double nota1 = 7.5;
    double nota2 = 5.5;
    double nota3 = 7.0;
    double nota4 = 8.0;
    double soma = nota1 + nota2 + nota3 + nota4;
    double media = soma / 4;
    if(media >= 6.0){
      System.out.println("Aprovado");
    }
    else{
    System.out.println("Reprovado");
  }
    }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}