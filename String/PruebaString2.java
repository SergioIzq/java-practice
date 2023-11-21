//Programa: PruebaString2
//Autor: Sergio Izquierdo Moreno
public class PruebaString2 {
    public static void main(String args[]){
        //Entorno:
            String str1;
        //Algoritmo:
            System.out.println("Introduzca una cadena de alfanuméricos: ");
            str1=Leer.dato();
            System.out.println("Esta cadena tiene "+str1.length()+" carácteres");
            if(str1.trim().indexOf(" ")>=0){
                System.out.println("Esta cadena tiene más de una palabra");
            }else{
                System.out.println("Esta cadena tiene una palabra");
            }//Fin Si
            System.out.println(str1);
            System.out.println(str1.replace('a', 'o'));        
    }//Fin Programa 
}

