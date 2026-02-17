package Atv2;
import java.util.Scanner;
public class Exercicio2 {


    public static void main (String[]args) {
        int[] numeros = new int[3];
        Scanner scanner = new Scanner(System.in);
        int i, j;
        boolean repetido = false;

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número : ");
            numeros[i]= scanner.nextInt();
        }
        for (i = 0; i < numeros.length - 1; i++) {

            for (j = i + 1; j < numeros.length; j++) {

                if (numeros[i] == numeros[j]) {
                    repetido = true;
                }
            }

        }
        if (repetido) {
            System.out.println("Tem números repetidos.");
        } else {
            System.out.println("Não tem números repetidos.");
        }

        scanner.close();
    }
}

