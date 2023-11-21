//Autor: Sergio Izquierdo Moreno
public class Consumo {
    //Atributos:
        private float kms;
        private float litros;
        private float vmed;
        private float precio=1.5F;
    //Constructores:
        public Consumo(){            
        }
     //Fin Constructores
     //Métodos:
        public void setKms(float kms){
            this.kms=kms;
        }//Fin Procedimiento
        public void setLitros(float litros){
            this.litros=litros;
        }//Fin Procedimiento
        public void setVmed(float vmed){
            this.vmed=vmed;
        }//Fin Procedimiento
        public void setPrecio(float precio){
            this.precio=precio;
        }//Fin Procedimiento
       public float getTiempo(){
            return this.kms/this.vmed;
       }//Fin Función
       public float consumoMedio(){
           return this.litros*100/this.kms;
       }//Fin Función
       public float consumoEuros(){           
           return this.precio*this.litros;
       }//Fin Función
     //Fin Métodos
}//Fin Objeto
