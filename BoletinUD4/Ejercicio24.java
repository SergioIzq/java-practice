/*Programa: NumerosPrimos
Autor: Sergio Izquierdo Moreno
Entorno:
    num es numérico entero
    i es numérico entero
    contador es numérico entero
    resto es numérico entero
Algoritmo:
    Repetir
        Escribir "Introduzca un número para saber si es primo: "
        Leer num
    Hasta num>=0
    Si num=0 o num=1 entonces
        Escribir "No es primo"
    Sino
    num<--num/2
    Para num de 1 a i hacer
       resto<--num%i
       Si resto=0 entonces
            contador<--contador+1
    Fin Si
    Fin Para
    Si contador<=2 entonces
        Escribir "El número es primo"
    Sino
        Escribir "El número no es primo"
Fin Programa*/

//Programa: NumerosPrimos
//Autor: Sergio Izquierdo Moreno
public class Ejercicio24{
    public static void main(String[] args){
    //Entorno:
        int num,contador,i,resto;
    //Algoritmo:
        contador=0;
        do{
            System.out.println("Introduzca un número para saber si es primo: ");
            num=Leer.datoInt();
        }while(num<0);
        if(num==0 || num==1){
            System.out.println("No es primo");
        }else{
            for(i=1;i<=num;i++){
                resto=num%i;
                if(resto==0){
                    contador++;
            }//Fin Si
          }//Fin Para
          if(contador<=2){
              System.out.println("Es número primo");
          }else{
              System.out.println("No es número primo");
          }//Fin Si
              }//Fin Si
    }//Fin Programa
}