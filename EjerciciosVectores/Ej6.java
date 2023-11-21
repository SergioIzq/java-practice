/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ej6 {
    public static void main(String[] args){
    //Entorno:
        byte i;
        int num[]={7,8,3,0,33},numConsulta;        
        String opcion;
    //Algoritmo:        
        i=0;
        do{
            System.out.println("Pulse A para realizar una consulta: ");
            System.out.println("Pulse B para salir: ");
            opcion=Leer.dato();           
            if(opcion.matches("[Aa]")){
                System.out.println("Introduzca el número a consultar: ");
                numConsulta=Leer.datoInt();
                while(i<num.length-1 && num[i]!=numConsulta){
                    i++;
                }//Fin Mientras
                if(num[i]==numConsulta){
                    i++;
                    System.out.println("El número consultado ha sido encontrado en la posición "+i);
                }else{
                    System.out.println("El número consultado no se ha encontrado");
                }//Fin Si
            }//Fin Si
        }while(opcion.matches("[^ABab]"));    
    }//Fin Programa
}
