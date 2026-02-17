package Atv1;


public class Exercicio1 {

    public static void main(String[] args) {

        double [] notas = {7.5,4.0,9.3,5.5,8.0,6.5,3.2,10.0,5.8};
        double media, soma = 0, maior = 0 ;
        int i, q = 0; // q = quantidade
        for (i =0 ; i < notas.length; i++){
            soma = notas[i] + soma;
        }
        media = soma/ notas.length;

        for (i =0 ; i < notas.length; i++){
            if (notas[i] > media){
                q = q+ 1;
            }
        }
        for (i =0 ; i < notas.length; i++){
            double aux = notas[i];
            if (aux > maior){
                maior = aux;
            }
        }
        System.out.println ("A soma e:"+ soma);
        System.out.println("A media das notas: " + media);
        System.out.println ("A quantidade de numeros acima da media e: "+q);
        System.out.println ("O maior numero e :"+ maior) ;


    }
}
