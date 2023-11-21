//Autor: Sergio Izquierdo Moreno
public class Contador {
    //Atributos:
        private int valor;
        private int incremento=1;                
    //Constructores:
        public Contador(){
        }
        public Contador(int incremento){
            this.incremento=incremento;
        }
        public Contador(int valor, int incremento){
            this.valor=valor;
            this.incremento=incremento;
        }
    //Métodos:
        public int getIncremento(){
            return this.incremento;
        }
         public void inciaCuenta(int valor){        
            this.valor=valor;
        }
        public void incrementaCuenta(){
            this.valor=this.valor+this.incremento;         
        }
        public int obtenerCuenta(){ 
            return this.valor;
        }  
}//Fin Clase
