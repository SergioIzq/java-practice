
/*Programa: Calculadora
Entorno:
    num1 es numérico real
    num2 es numérico real
    eleccion es numérico entero
    resultado es numérico real
Algoritmo:
    Escribir "Introduzca el primer número: "
    Leer num1
    Escribir "Introduzca el segundo número: "
    Leer num2
    Repetir 
        Escribir "Eliga una de las siguientes opciones"
                "1. Suma"
                "2. Resta"
                "3. Multiplicación"
                "4. División"
                "5. Resto"
        Leer eleccion
        Si eleccion<1 y eleccion>5 entonces 
            Escribir "Error, introduzca una opción acorde al menú anterior"
        Fin Si
    Hasta eleccion>=1 y eleccion<=5  
    Según Sea eleccion hacer 
        1:  
            resultado<--num1+num2
            Escribir num1," + ",num2," = ",resultado
        2:
            resultado<--num1-num2
            Escribir num1," - ",num2," = ", resultado
        3:    
            resultado<--num1*num2
            Escribir num1," * ",num2," = ", resultado
        4:
            Si num2!=0 entonces 
                resultado<--num1/num2
                Escribir num1," / ",num2," = ",resultado            
            Sino            
                Escribir "Error, no se puede realizar la division"
            Fin Si
        5:
            Si num2!=0 entonces 
                resultado<--num1%num2
                Escribir num1," % ",num2," = ",resultado
            Sino
                Escribir "Error, no se puede realizar la división"
            Fin Si
     Fin Según Sea      
Fin Programa*/

//Programa: Calculadora
///Autor: Sergio Izquierdo Moreno
public class Ejercicio10{
    public static void main(String[] args){
    //Entorno:
        float num1,num2,resultado;
        short eleccionShort;
        byte eleccionByte;
    //Algoritmo:
        System.out.println("Introduzca el primer número: ");
        num1=Leer.datoFloat();
        System.out.println("Introduzca el segundo número: ");
        num2=Leer.datoFloat();
        do{
            System.out.println("Eliga una de las siguientes opciones");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Resto");
            eleccionShort=Leer.datoShort();
            eleccionByte=(byte)eleccionShort;
            if(eleccionByte<1 || eleccionByte>5){
                System.out.println("Error, introduzca una opción acorde al menú anterior");
            }//Fin Si
        }while(eleccionByte<1 || eleccionByte>5);
        switch(eleccionByte){
            case 1:
                    resultado=num1+num2;
                    System.out.println(num1+" + "+num2+" = "+resultado);
                break;
            case 2:
                    resultado=num1-num2;
                    System.out.println(num1+" - "+num2+" = "+resultado);
                break;
            case 3:
                    resultado=num1*num2;
                    System.out.println(num1+" * "+num2+" = "+resultado);
                break;
            case 4:
                    if(num2!=0){
                        resultado=num1/num2;
                        System.out.println(num1+" / "+num2+" = "+resultado);                        
                    }else{
                        System.out.println("Error, no se puede realizar la división");
                    }//Fin Si
                break;
            case 5:
                    if(num2!=0){
                        resultado=num1%num2;
                        System.out.println(num1+" % "+num2+" = "+resultado);                        
                    }else{
                        System.out.println("Error, no se puede realizar la división");
                    }//Fin Si
        }//Fin Según Sea  
    }//Fin Programa
}