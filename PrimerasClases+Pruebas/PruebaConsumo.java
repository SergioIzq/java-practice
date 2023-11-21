//Programa: PruebaConsumo
//Autor: Sergio Izquierdo Moreno
public class PruebaConsumo {
    public static void main(String []args){
    //Entorno:
        Consumo j1;
    //Algoritmo:
        j1=new Consumo();
        j1.setKms(20);
        j1.setLitros(10);
        j1.setVmed(25);
        j1.setPrecio(1.3F);
        System.out.println(j1.getTiempo());
        System.out.println(j1.consumoMedio());
        System.out.println(j1.consumoEuros());
    }//Fin Programa
}
