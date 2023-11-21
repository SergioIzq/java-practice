/*Programa: Ejercicio15
 Autor: Sergio Izquierdo Moreno
 Entorno:
 	numMayor es numérico real
	 numMenor es numérico real
	 numAux es numérico real
	 i es numérico entero
 Algoritmo:
	 Escribir "Introduzca el 1º número: "
	 Leer numAux
	 numMayor<--numAux
	 numMenor<--numAux
	 Para i de 1 a 3 hacer
		 Escribir "Introduzca el ",i,"º número: "
		 Leer numAux
		 Si numAux>numMayor entonces
			 numMayor<--numAux
		 Fin Si
		 Si numAux<numMenor entonces
			 numMenor<--numAux
		 Fin Si        
	 Fin Para
	 Escribir "El mayor número de los introducidos es el ",numMayor
	 Escribir "El menor número de los introducidos es el ",numMenor
 Fin Programa*/

/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        //Entorno:
        float numMayor, numMenor, numAux;
        byte i;
        //Algoritmo:        
        System.out.println("Introduzca el 1º número: ");
        numAux = Leer.datoInt();
        numMayor = numAux;
        numMenor = numAux;
        for (i = 1; i <= 3; i++) {
            System.out.println("Introduzca el " + i + "º número: ");
            numAux = Leer.datoInt();
            if (numAux > numMayor) {
                numMayor = numAux;
            }//Fin Si
            if (numAux < numMenor) {
                numMenor = numAux;
            }//Fin Si            
        }//Fin Para
        System.out.println("El mayor número de los introducidos es el " + numMayor);
        System.out.println("El menor número de los introducidos es el " + numMenor);
    }//Fin Programa
}
