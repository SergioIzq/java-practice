//Autor: Sergio Izquierdo Moreno
public class PruebaFecha1 {
    public static void main(String []args){
        //Entorno: 
            Fecha1 f1,f2;
        //Algoritmo:
            f1=new Fecha1();
            System.out.println(f1.getDia());
            System.out.println(f1.getMes());
            System.out.println(f1.getAnio());
            
            f1.setFecha((byte)12, (byte)10, (short)2000);
            System.out.println(f1.getDia());
            System.out.println(f1.getMes());
            System.out.println(f1.getAnio());
            
            System.out.println(f1.mostrarFecha());
            System.out.println(f1.esFechaCorrecta());
            f1.setFecha((byte)0, (byte)21, (short)1);
            System.out.println(f1.esFechaCorrecta());
            
            System.out.println(f1.esBisiesto());
            f1.setFecha((byte)1, (byte)1, (short)2000);
            System.out.println(f1.esBisiesto());
    }//Fin Programa
}
