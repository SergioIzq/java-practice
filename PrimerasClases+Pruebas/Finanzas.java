//Autor: Sergio Izquierdo Moreno
public class Finanzas {
    //Atributos: 
        private static double importeCambio=1.37;
    //Constructores:
        public Finanzas(){
        }
        public Finanzas(double importeCambio){
            Finanzas.importeCambio=importeCambio;
        }
    //Fin Constructores
    //Métodos:
        public double dolaresToEuros(double dolares){
            return dolares/Finanzas.importeCambio;
        }
        public double eurosToDolares(double euros){
            return euros*Finanzas.importeCambio;
        }
    //Fin Métodos
}//Fin Objeto
