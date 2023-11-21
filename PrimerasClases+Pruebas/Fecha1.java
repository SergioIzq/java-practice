//Autor:Sergio Izquierdo Moreno
public class Fecha1 {
    //Atributos:
        private byte dia=1;
        private byte mes=1;
        private short anio=1582;
    //Constructores:
        public Fecha1(){
        }
    //Métodos:
       public void setFecha(byte dia,byte mes,short anio){
           this.dia=dia;
           this.mes=mes;
           this.anio=anio;
        }     
       public String mostrarFecha(){
           String str1;           
           str1="La fecha es "+this.dia+"/"+this.mes+"/"+this.anio;
           return str1;
       }
       public boolean esFechaCorrecta(){         
           return esFechaValida(this.dia,this.mes,this.anio);
       }
       public byte getDia(){
           return this.dia;
       }
       public byte getMes(){
           return this.mes;
       }
       public int getAnio(){
           return this.anio;
       }
       public final boolean esBisiesto(){           
           return esBisiesto(this.anio);
       }
       private final boolean esFechaValida(byte d,byte m,short a){
    //Entorno:
        boolean esBisiesto,esFechaValida;
    //Algoritmo:
        esFechaValida=true;
        esBisiesto=false;
        if(a<1582){
            esFechaValida=false;
        }//Fin Si
        if((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))){
            esBisiesto=true;
        }//Fin Si
        if(m<1 || m>12){
            esFechaValida=false;
        }//Fin Si
        switch(m){
            case 1:
                if(d<1 || d>31){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 2:
                if(esBisiesto){
                    if(d<1 || d>29){
                        esFechaValida=false;
                    }//Fin Si
                }else{
                    if(d<1 || d>28){
                        esFechaValida=false;
                    }//Fin Si
                }//Fin Si
                break;
            case 3:
                if(d<1 || d>31){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 4:
                if(d<1 || d>30){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 5:
                if(d<1 || d>30){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 6:
                if(d<1 || d>30){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 7:
                if(d<1 || d>31){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 8:
                if(d<1 || d>30){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 9:
                if(d<1 || d>31){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 10:
                if(d<1 || d>30){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 11:
                if(d<1 || d>30){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 12:
                if(d<1 || d>31){
                    esFechaValida=false;
                }//Fin Si
                break;
            default:
                esFechaValida=false;
        }//Fin Según Sea
        return esFechaValida;
    }//Fin Función
       private final boolean esBisiesto(int a){
    //Entorno:
        boolean esBisiesto;
    //Algoritmo:
        esBisiesto=false;
        if((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))){
            esBisiesto=true;
        }//Fin Si
        return esBisiesto;
    }//Fin Función
       
}//Fin Clase
