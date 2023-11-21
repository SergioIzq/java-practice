public class Ejercicio14 {
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
            }//Fin Si        
        }else{
            System.out.println("Error, introduzca un número positivo");
        }//Fin Si
        return digitoByte;
    }//Fin Función     
 public static void main(String []args){
     //Entorno:
        int binario,resultado,resto,digito;
        byte i,pos;
        //byte pos;
        //boolean numeroIncorrecto;
     //Algoritmo:
        resto=0;
        resultado=0;
        /*Sé que tengo que controlar la entrada para que solo se puedan meter binarios,
        lo que he pensado es comprobar dígito a dígito que solo haya 0 y 1, si
        hay otros dígitos que no sean esos tiene que volver a escribirlo,pero
        no me sale, porque haga lo que haga me vuelve a pedir el número*/
        /*numeroIncorrecto=false;        
        pos=-1;
        do{
            
            System.out.println("Introduzca un número en base 2: ");
            binario=Leer.datoInt();
            for(i=0;i<cifras(binario);i++){                   
                    pos++;                 
                    if((sacaDigito(binario,pos))!=0 || sacaDigito(binario,pos)!=1){
                        numeroIncorrecto=true;                                        
                    }//Fin Si
            }//Fin Para
        }while(numeroIncorrecto=true);*/
        System.out.println("Introduzca un número en base 2: ");
        binario=Leer.datoInt();
        pos=0;
        for(i=cifras(binario);i>=0;i--){
            pos++;
            resultado=(resto*2)+sacaDigito(binario,(byte)0);
            resto=resultado;
        }//Fin Para
        System.out.println(resultado);
            
 
 
 
 
 }//Fin Programa   
}
