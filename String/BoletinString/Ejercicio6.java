//Programa: Ejercicio6
//Autor: Sergio Izquierdo Moreno
public class Ejercicio6 {
    public static void main(String []args){
    //Entorno:
        String cadenaOriginal;
        byte i;
    //Algoritmo:
        do{            
            System.out.println("Introduzca una cadena: ");
            cadenaOriginal=Leer.dato();
        }while(cadenaOriginal.length()>10 || cadenaOriginal.length()<=0);
        for(i=0;i<=cadenaOriginal.length()-1;i++){
            cadenaOriginal=cadenaOriginal.substring(cadenaOriginal.length()-1)+cadenaOriginal.substring(0,cadenaOriginal.length()-1);                 
            System.out.println(cadenaOriginal);                         
        }//Fin Para        
    }//Fin Programa
}
