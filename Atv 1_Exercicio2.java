package Atv1;

import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args){

        // numero lido
        int n;
        System.out.println("Digite um numero:");
        Scanner scanner = new Scanner(System.in);
        n =  scanner.nextInt();
        int notas50 = n / 50;
        n = n % 50;
        int notas20 = n / 20;
        n = n% 20;
        int notas10 = n /10;
        System.out.println( "Sao " + notas50  +" notas de 50");
        System.out.println("Sao " + notas20  + " notas de 20");
        System.out.println("Sao " + notas10  + " notas de 10");

        scanner.close();

    }

}
