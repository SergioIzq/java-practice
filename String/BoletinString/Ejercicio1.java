//Programa: Ejercicio1
//Autor: Sergio Izquierdo Moreno
public class Ejercicio1 {
    public static void main(String[] args) {
    //Entorno:
        String cadena; 
    //Algoritmo:
        do{
            System.out.println("Introduzca una cadena de longitud máxima (25 caracteres): ");
            cadena=Leer.dato();
        }while(cadena.length()>25 || cadena.length()==0);           
        cadena=cadena.replaceAll("  +", " ");
        System.out.println(cadena.trim()); 
    }//Fin Programa
}
