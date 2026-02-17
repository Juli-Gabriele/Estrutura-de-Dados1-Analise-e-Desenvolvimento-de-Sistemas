#include <iostream>
#define tam 10
  using namespace std;
int main()
{
    int v[tam],i,j;
    bool  repetido = false;
    
     for(i = 0; i < tam ; i++){
         cin >> v[i];
     }
     for(i = 0; i < tam - 1 ; i++){
          
         for(j = i + 1; j < tam  ; j++){
                
                if (v[i] == v[j]){
                        repetido = true;
                 }
                }     
                 
     }
     
     if (repetido != true){
         cout << "Tem números repetidos"<< endl;
     }else{
         cout <<"Não tem numeros repetidos"<< endl;
     }
