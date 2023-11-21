//Programa: PruebaString
//Autor: Sergio Izquierdo Moreno
public class PruebaString {
    public static void main(String []args){
        //Entorno:
            String nombre,ape1,ape2,nombreCorrecto;
          
        //Algoritmo:
            System.out.println("Introduzca su nombre: ");
            nombre=Leer.dato();
            System.out.println("Introduzca su primer apellido: ");
            ape1=Leer.dato();
            System.out.println("Introduzca su segundo apellido: ");
            ape2=Leer.dato();
            nombre=nombre.trim();
            ape1=ape1.trim();
            ape2=ape2.trim();
            nombreCorrecto=nombre.substring(0, 1).toUpperCase()+
            nombre.substring(1).toLowerCase()+" "+
            ape1.substring(0, 1).toUpperCase()+ape1.substring(1)
            .toLowerCase()+" "+ape2.substring(0, 1).toUpperCase()+
            ape2.substring(1).toLowerCase();
            System.out.println(nombreCorrecto);    
    }//Fin Programa
}
