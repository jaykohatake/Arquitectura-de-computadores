//Tu código en C++
#include <time.h>
#include <stdlib.h>
#include <iostream>
#include <fstream>
#include    <ctime>
#include    <sys/timeb.h>
using namespace std;

int main() {
     double num,dos;
     double secs;
     int i =0;
clock_t t_ini, t_fin;

 t_ini = clock();
while(i<1000){
     fstream arch;


     arch.open("suma.txt");
     if (!arch) {
          cout<<"No se encontro el archivo";
          return 1;
     }

     while(arch>>num>>dos){

         cout<<"suma"<<num+dos<<endl;
         cout<<"resta"<<num-dos<<endl;
         cout<<"multiplicacion"<<num*dos<<endl;
         cout<<"division"<<num/dos<<endl;

        // }
     }


arch.close();
i++;
   }

    t_fin = clock();
     cout<< endl;
secs = (double)(t_fin - t_ini) / CLOCKS_PER_SEC;
  printf("%.16g milisegundos\n", secs * 1000.0);
     return 0;
}
