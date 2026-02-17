package Atv2;
import java.util.Scanner;
import java.lang.ArithmeticException;
public class Exercicio1 {
    public static void main(String[]args){
      int segundos, horas, minutos;
      System.out.println("Digite um número em segundos :");
      Scanner scanner = new  Scanner (System.in);
      segundos = scanner.nextInt();
      horas= segundos / 3600;
      minutos = (segundos % 3600)/60;
      segundos = segundos % 60;

        System.out.printf(" São horas: %d%n", horas);
        System.out.printf(" São minutos: %d%n",minutos);
        System.out.printf(" São segundos: %d%n", segundos);

    }
}
