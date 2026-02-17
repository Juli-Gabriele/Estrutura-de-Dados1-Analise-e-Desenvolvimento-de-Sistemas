package Atv1;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int i;
        boolean ver1 = false, ver2 = false;
        String mens;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha : ");
        mens = scanner.nextLine();

        if (mens.length() >= 8) {
            ver1 = true;
        }
        for (i = 0; i < mens.length(); i++) {

            char c = mens.charAt(i);
            if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c)) {
                ver2 = true;
            }
        }
        if (ver1 && ver2) {
            System.out.println("Sua senha é valida ");
        } else {
            System.out.println("Sua é invalida ");
            if (!ver2) {
                System.out.println("Sua senha deve possuir caracter especial");
            }
            if (!ver1) {
                System.out.println("Sua senha deve ter no minimo 8 caracteres");
            }
            scanner.close();
        }
    }
}




