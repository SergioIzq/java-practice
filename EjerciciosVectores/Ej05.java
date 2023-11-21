
/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ej05 {

    public static void main(String[] args) {
        //Entorno:
        int posicion[],numMax,num;
        String linea="";
        byte i,contador;
        //Algoritmo:
        posicion=new int[5];
        contador=0;
        numMax=Integer.MIN_VALUE;
        for (i = 0; i <= posicion.length-1; i++) {
            System.out.println("Introduzca el " + i + " número entero");
            num = Leer.datoInt();
            if (num > numMax) {
                numMax = num;
                contador = 0; // Reiniciar contador de posiciones
            }

            // Almacenar la posición del número ingresado
            if (num == numMax) {
                posicion[contador] = i;
                contador++; // Incrementar contador de posiciones
            }
        }

        // Mostrar el mayor número
        System.out.println("El mayor número introducido es: " + numMax);

        // Mostrar las posiciones en las que se ha introducido
        for (i = 0; i < contador; i++) {
            linea=linea+" "+posicion[i];
        }
        System.out.println("Se ha introducido en las posiciones: "+linea);
    }
}