
/*Programa: VolumenAreaEsfera
Autor: Sergio Izquierdo Moreno
Entorno:
    radio es numérico real
    CONST PI es numérico real<--3.1416
    volumen es numérico real
    area es numérico real
Algoritmo:
    Repetir 
        Escribir "Introduzca un radio superior a 0: "
        Leer radio
        Si radio<0 entonces 
            Escribir "Error, introduzca un radio positivo"
        Fin Si
    Hasta radio>0
    volumen<--(4/3)*PI*radio**3
    area<--4*PI*radio**2
    Escribir "El volumen de la esfera con radio ",radio," es",volumen," y el área de la misma es ",area
Fin Programa*/

//Programa: VolumenAreaEsfera
//Autor: Sergio Izquierdo Moreno
    public class Ejercicio4{
        public static void main(String[] args){
        //Entorno:
            float radio,volumen,area;
            final float PI=3.1416F;
        //Algoritmo:
            do{
                System.out.print("Introduzca un radio superior a 0: ");
                radio=Leer.datoFloat();
                if(radio<0){
                    System.out.println("Error, introduzca un radio superior a 0");
                }//Fin Si
            }while(radio<0);            
            area=4*PI*((float)Math.pow(radio,2));
            volumen=4/3F*PI*((float)Math.pow(radio, 3));
            System.out.print("El volumen de la esfera es "+volumen+" y el área de la misma es "+area);
    }//Fin Programa
  }
