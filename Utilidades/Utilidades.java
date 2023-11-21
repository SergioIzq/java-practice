
public class Utilidades{
    
    public static byte sacaDigito(int num,byte pos){
        //Entorno:
        int i1,i,cantidadDigitos,numDivisiones,digitoInt;
        byte digitoByte,posicionByte;
        //Algoritmo:
        digitoInt=0;
        i1=0;
        digitoByte=0;
        if (num>=0){
            cantidadDigitos=num;
            while(cantidadDigitos>=1){
                cantidadDigitos=cantidadDigitos/10;
                i1++;
            }//Fin Mientras
            if(pos>=0 & pos<=i1){
                numDivisiones=i1-pos;
                for(i=1;i<=numDivisiones;i++){
                    digitoInt=num%10;
                    num=num/10;
                }//Fin Para
                digitoByte=(byte)digitoInt;
                System.out.println("El dígito de la posición seleccionada es "+digitoByte);
            }else{
            System.out.println("Error, introduzca un número de posición adecuado");
            }//Fin Si        
        }else{
            System.out.println("Error, introduzca un número positivo");
        }//Fin Si
        return digitoByte;
    }//Fin Función     

    public static boolean esFechaValida(byte d,byte m,short a){
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
    }//Fin Programa
    
    public static byte cifras(int num){
    //Entorno:
        int contenedorNum;
        byte cifras;            
    //Algoritmo:
        cifras=0;
        if(num>=0){
            contenedorNum=num;
            while (contenedorNum>=1){
            contenedorNum=contenedorNum/10;
            cifras++;
        }//Fin Mientras
        }else{
            System.out.println("Error, introduzca un número positivo");
        }//Fin Si
        return cifras;
    }//Fin Función
    
    public static int invierte(int num){
    //Entorno:
        int numInvertido;
    //Algoritmo:
        numInvertido=0;
        if(num>0){
            do{
                numInvertido=numInvertido*10;
                numInvertido=numInvertido+num%10;
                num=num/10;
             }while(num>0);
        }else{
            System.out.println("Error, intrduzca un número mayor que 0");
        }//Fin Si
        return numInvertido;
    }//Fin Función
    
    public static boolean esBisiesto(short a){
    //Entorno:
        boolean esBisiesto;
    //Algoritmo:
        esBisiesto=false;
        if((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))){
            esBisiesto=true;
        }//Fin Si
        return esBisiesto;
    }//Fin Función

    public static boolean deseaContinuar(){
    //Entorno:
        boolean deseaContinuar;
        char respuesta;
    //Algoritmo:
        do {
            do {
                System.out.print("¿Desea continuar (S/N)?: ");
                respuesta = Leer.datoChar();
            } while (respuesta != 's' && respuesta != 'n' && respuesta != 'S' && respuesta != 'N');
        } while (respuesta != 's' && respuesta != 'S');
        deseaContinuar=true;
        return deseaContinuar;
    }//Fin Función
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

