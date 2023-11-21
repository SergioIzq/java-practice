//Programa: Ejercicio4
//Autor: Sergio Izquierdo Moreno
public class Ejercicio4 {
    public static String limpiaEspacio(String str1) {
        return str1.replaceAll("  +", " ").trim(); 
    }//Fin Programa
    public static void main(String []args){
    //Entorno:
        String cadena,str2,cadenaInvertida;
        byte i,i2;
    //Algoritmo:
        cadenaInvertida="";
        do{
            System.out.println("Introduzca una cadena: ");
            cadena=Leer.dato();
        }while(cadena.length()>256 || cadena.isEmpty());
        cadena=limpiaEspacio(cadena);        
        do{
            if(cadena.indexOf(" ")!=-1){
                str2=cadena.substring(0, cadena.indexOf(" "));  
                cadena=cadena.replaceAll(str2, "").trim();
                i=1;
                i2=0;
                do{    
                    cadenaInvertida=cadenaInvertida+str2.substring(str2.length()-i,str2.length()-i2);        
                    i++;
                    i2++;
                }while(i2!=str2.length());
                cadenaInvertida=cadenaInvertida+" ";
            }else{
                str2=cadena.substring(0, cadena.length());
                cadena=cadena.replaceAll(str2, "").trim();
                i=1;
                i2=0;
                do{
                    cadenaInvertida=cadenaInvertida+str2.substring(str2.length()-i,str2.length()-i2);        
                    i++;
                    i2++;
                }while(i2!=str2.length());                  
            }//Fin Si
        }while(!cadena.isEmpty());
        System.out.println(cadenaInvertida);
    }//Fin Programa
}

