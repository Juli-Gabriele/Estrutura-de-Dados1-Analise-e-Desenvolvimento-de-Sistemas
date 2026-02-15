#include<iostream>
#include <string>
using namespace std;
int main(){
  int i, ver1 =0, ver2 = 0;// ver1 1°verificação //ver2 2° verificação
 string mens;
 getline(cin, mens);

  if (mens.length() >= 8) {
   ver1 = 1;
}
   for ( i = 0; i < mens.length() ; i++){
     char c = mens[i];
     if (ispunct(c)) {
       ver2 = 1;
    }

   }

   if (ver1 == 1 && ver2 == 1){

    cout << "Senha  valida"<< endl;
   }else{
    cout << "Senha  Invalida"<< endl;
    if (ver1 == 0){
        cout<< "Sua senha deve ter no minimo 8 caracteres"<< endl;
    }
      if (ver2 == 0){
        cout << "Sua senha deve ter um caracter especial"<< endl;
    }

}
}
