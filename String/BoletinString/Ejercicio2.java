//Programa:
//Autor: Sergio Izquierdo Moreno
public class Ejercicio2 {
    public static void main (String args[]){
    //Entorno:
        String cadena,cadenaInvertida="";  
        int i,i2,contador;
        boolean esPalindromo;            
    //Algoritmo:
        esPalindromo=false;
        i=1;
        i2=0; 
        do{
            System.out.println("Introduzca una cadena: ");
            cadena=Leer.dato();
        }while(cadena.length()==0);
        do{
            cadenaInvertida=cadenaInvertida+cadena.substring(cadena.length()-i,cadena.length()-i2);        
            i++;
            i2++;
        }while(i2!=cadena.length());  
        do{
            cadena=cadena.replaceAll(" ", "");
            cadenaInvertida=cadenaInvertida.replaceAll(" ", "");
        }while(cadenaInvertida.indexOf("  ")!=-1 && cadena.indexOf("  ")!=-1);
        if(cadena.compareToIgnoreCase(cadenaInvertida)==0){
            esPalindromo=true;
        }//Fin Si
        if(esPalindromo){
            System.out.println("La cadena es palíndroma");
        }else{
            System.out.println("La cadena no es palíndroma");
        }//Fin Si
    }//Fin Programa
}

