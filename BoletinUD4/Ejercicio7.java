
/*Programa: PosicionNumero
Autor: Sergio Izquierdo Moreno
Entorno:
    num es numérico entero
    i1 es numérico entero
    i2 es numérico entero
    posicion es numérico entero
    i3 es numérico entero
Algoritmo:
    i1<--0
    Escribir "Introduzca un número: "
    Leer num
    Mientras n>=1 hacer
        num<--num/10
        i1<--i1+1
    Fin Mientras
    Repetir
        Escribir "Introduzca la posición del digíto que desea saber: "
        Leer posicion
        Si posicion<0 y posicion>i1 entonces  
            Escribir "Error, introduzca un número de posición adecuado"
        Fin Si
    Hasta posicion>=0 y posicion<=i1
    Para i2 de 0 a posicion hacer
        digito<--num%10
        num<--num/10
    Fin Para
    Escribir "El dígito de la posición seleccionada es ",i2
    Fin Programa
    */   
  
//Programa: PosicionNumero
//Autor: Sergio Izquierdo Moreno
public class Ejercicio7{
    public static void main(String[] args){
    //Entorno:
        int num,cifras,digito,copiaNum;
        short posicionShort;
        byte i,posicionByte;
    //Algoritmo:
        cifras=0;
        digito=0;
        do{
            System.out.println("Introduzca un número: ");
            num=Leer.datoInt();
        }while(num<0);
        copiaNum=num;
        while(copiaNum>=1){
            copiaNum=copiaNum/10;
            cifras++;
        }//Fin Mientras
        do{
            System.out.println("Introduzca la posición del dígito que desea saber: ");
            posicionShort=Leer.datoShort();
            posicionByte=(byte)posicionShort;
            if(posicionByte<0 || posicionByte>cifras){
                System.out.println("Error, introduzca un número de posición adecuado");
            }//Fin Si
        }while(posicionByte<0 || posicionByte>cifras);
        for(i=0;i<=posicionByte;i++){
            digito=num%10;
            num=num/10;
        }//Fin Para
        System.out.println("El dígito de la posición seleccionada es "+digito);
    }//Fin Programa
}