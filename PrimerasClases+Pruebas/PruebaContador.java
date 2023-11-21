
public class PruebaContador {
    public static void main(String []agrs){
        //Entorno:
            Contador j1,j2,j3,j4;
        //Algoritmo:
            j1=new Contador();
            System.out.println(j1.getIncremento());
            j2=new Contador(3);
            System.out.println(j2.getIncremento());
            j3=new Contador(6,4);
            System.out.println(j3.getIncremento());
            System.out.println(j3.obtenerCuenta());
    
            j3.inciaCuenta(2);
            System.out.println(j3.obtenerCuenta());
            System.out.println(j3.getIncremento());
            j3.incrementaCuenta();
            System.out.println(j3.obtenerCuenta());
            
            j4=new Contador(1,-2);
            j4.incrementaCuenta();
            System.out.println(j4.obtenerCuenta());
            j4.incrementaCuenta();
            System.out.println(j4.obtenerCuenta());
    }//Fin Programa
}
