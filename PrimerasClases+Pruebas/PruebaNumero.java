//Programa:PruebaNumero
//Autor: Sergio Izquierdo Moreno
public class PruebaNumero{
    public static void main(String[] args){
    //Entorno:
        Numero j1,j2;
    //Algoritmo:
        //Probando los constructores, con el por defecto debería crear el objeto con los atributos inicializados por defecto
        j1=new Numero();
        System.out.println(j1.getValor());
        //Probando el constructor con el que se indica el valor con el que quiero que se inicialice, si inicializo con 23, con el getValor debería salir 23
        j2=new Numero(23);
        System.out.println(j2.getValor());
        //Probando el método aniade en j2,deberia suceder 23+10(el valor a añadir) si meto un 10 cuando use getValor para consultar el valor debería darme un 33
        j2.aniade(10);
        System.out.println(j2.getValor());
        //Probando el método resta, si ingreso un número 20, debería suceder 33-20=13, por lo tanto cuando consulte el valor debería darme 13
        j2.resta(20);
        System.out.println(j2.getValor());
        System.out.println(j2.getDoble());
        System.out.println(j2.getTriple());
        System.out.println(j2.getCuadraple());
        j2.setValor(10);
        System.out.println(j2.getValor());
    }//Fin Programa
}
