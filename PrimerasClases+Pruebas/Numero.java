//Autor: Sergio Izquierdo Moreno
public class Numero {
    //Atributos:
        private int valor;
    //Constructores:
        public Numero(){
            
        }
        public Numero(int valor){
            this.valor=valor;
        }
    //Fin Constructores
    //Métodos:
        public void aniade(int n){
            this.valor=this.valor+n;
        }//Fin Procedimiento
        public void resta(int n){
            this.valor=this.valor-n;
        }//Fin Procedimiento
        public int getValor(){
            return this.valor;
        }//Fin Método
        public int getDoble(){
            return this.valor*2;
        }//Fin Función
        public int getTriple(){
            return this.valor*3;
        }//Fin Función
        public int getCuadraple(){
            return this.valor*4;
        }//Fin Función
        public void setValor(int valor){
            this.valor=valor;
        }//Fin Procedimiento
    //Fin Métodos 
}//Fin Objeto
