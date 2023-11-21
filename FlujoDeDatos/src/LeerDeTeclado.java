
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class LeerDeTeclado {

    public static void main(String[] args) throws IOException {
        //Entorno:
        InputStreamReader entrada;
        BufferedReader teclado;
        String cadena = null;
        int num;
        //Algoritmo:
        entrada = new InputStreamReader(System.in);
        teclado = new BufferedReader(entrada);
        try {
            do {
                System.out.println("Introduzca una cadena de máximo 5 caracteres: ");
                cadena = teclado.readLine();
            } while (cadena.length() > 5 || cadena.isEmpty());
            try {
                num = Integer.parseInt(cadena);
                System.out.println(num);
            } catch (NumberFormatException nfe) {
                System.err.println("Error de formato");
            }//Fin Try
        } catch (IOException ioe) {
            System.err.println("Error de E/S");
        }//Fin Try
    }//Fin Programa
}
