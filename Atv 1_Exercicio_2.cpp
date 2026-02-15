#include<iostream>
using namespace std;
int main(){
int n; // numero lido

cin >> n;
 int notas50 = n / 50;
 n = n % 50;
 int notas20 = n / 20;
 n = n% 20;
 int notas10 = n /10;
 cout << "Sao " << notas50 << "notas de 50"<< endl;
 cout << "Sao " << notas20 << "notas de 20"<< endl;
 cout << "Sao " << notas10 << "notas de 10"<< endl;


}
