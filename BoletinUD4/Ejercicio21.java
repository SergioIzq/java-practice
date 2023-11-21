/*Programa: LadosTriangulo
Autor: Sergio Izquierdo Moreno
Entorno:
    primerLado es numérico real
    segundoLado es numérico real
    tercerLado es numérico real
Algoritmo:
    Repetir 
        Escribir "Introduzca el primer lado del triángulo: "
        Leer primerLado
    Hasta primerLado>=0
    Repetir 
        Escribir "Introduzca el segundo lado del triángulo: "
        Leer segundoLado
    Hasta primerLado>=0
    Repetir 
        Escribir "Introduzca el tercer lado del triángulo: "
        Leer tercerLado
    Hasta primerLado>=0
    Si primerLado !=0 y segundoLado !=0 y tercerLado !=0 entonces
        Si primerLado**2=(segundoLado**2+tercerLado**2) entonces 
            Escribir "El triángulo introducido tiene un ángulo recto"
        Fin Si
        Si primerLado**2<(segundoLado**2+tecerLado**2) entonces
            Escribir "El triángulo introducido tiene todos sus ángulos agudos"
        Fin Si
        Si primerLado**2>(segundoLado**2+tecerLado**2) entonces
            Escribir "El triángulo introducido tiene un ángulo obtuso"
        Fin Si
    Sino
        Escribir "El triángulo introducido no existe"
    Fin Si
Fin Programa*/

//Programa: LadosTriangulo
//Autor: Sergio Izquierdo Moreno
public class Ejercicio21{
    public static void main(String[] args){
    //Entorno:
        float primerLado,segundoLado,tercerLado;
    //Algoritmo:
        do{
            System.out.print("Introduzca el primer lado del triángulo: ");
            primerLado=Leer.datoFloat();
        }while(primerLado<0);
          do{
            System.out.print("Introduzca el segundo lado del triángulo: ");
            segundoLado=Leer.datoFloat();
        }while(segundoLado<0);
          do{
            System.out.print("Introduzca el tecer lado del triángulo: ");
            tercerLado=Leer.datoFloat();
        }while(tercerLado<0);
        if(primerLado !=0 & segundoLado !=0 & tercerLado !=0){
            if(primerLado*primerLado==(segundoLado*segundoLado+tercerLado*tercerLado)){
                System.out.println("El triángulo introducido tiene un ángulo recto");
            }//Fin Si
            if(primerLado*primerLado<(segundoLado*segundoLado+tercerLado*tercerLado)){
                System.out.println("El triángulo introducido tiene todos sus ángulos agudos");   
            }//Fin Si
            if(primerLado*primerLado>(segundoLado*segundoLado+tercerLado*tercerLado)){
                System.out.println("El triángulo introducido tiene un ángulo obtuso");
            }//Fin Si
        }else{
            System.out.println("El triángulo no existe");
        }//Fin Si
    }//Fin Programa
}
        
    



