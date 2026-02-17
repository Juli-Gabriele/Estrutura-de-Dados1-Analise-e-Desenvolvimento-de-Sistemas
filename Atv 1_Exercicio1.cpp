#include <iostream>

using namespace std;
 int main(){
    double V[10]{7.5,4.0,9.3,5.5,8.0,6.5,3.2,10.0,5.8};
    double soma =0, media= 0, maior =0;
    int i, q = 0; // q = quantidade
    for (i =0 ; i < 10; i++){
        soma = V[i] + soma;
    }
     media = soma/ 10;

     for (i =0 ; i < 10; i++){
        if (V[i] > media){
           q = q+ 1;
        }
    }
    for (i =0 ; i < 10; i++){
       double aux = V[i];
       if (aux > maior){
        maior = aux;
       }
    }

    cout << "A soma e:" << soma <<endl;
    cout << "A media das notas: "<< media <<endl;
     cout <<"A quantidade de numeros acima da media e: "<< q <<endl;
    cout << "O maior numero e :"<< maior <<endl;
 }
