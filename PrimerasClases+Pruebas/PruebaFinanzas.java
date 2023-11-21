//Programa: PruebaFinanzas
//Autor: Sergio Izquierdo Moreno
public class PruebaFinanzas {
    public static void main(String []args){
    //Entorno:
        Finanzas j1,j2;
    //Algoritmo:
        j1= new Finanzas();
        j2=new Finanzas(2.3F);
        System.out.println(j1.dolaresToEuros(0.99F));
        System.out.println(j1.eurosToDolares(10));
    }//Fin Programa
}
