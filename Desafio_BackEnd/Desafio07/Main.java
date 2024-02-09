/* Calcular quantos azulejos serão necessários para cobrir uma parede de 2m de altura por 3m de largura, considerando que cada azulejo mede 25cm x 25cm
*/


public class Main{
  public static void main(String[] args){
    double altPar = 2.0;
    double larPar = 3.0;
    double altAz = 0.25;
    double larAz = 0.25;

   double quantidade = (altPar * larPar) / (altAz * larAz);
System.out.println("A quantidade de azulejos necessária é " + quantidade);
}