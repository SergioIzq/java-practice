public class Empleado {
    //Atributos:
        private String nombre;
        private String apellidos;
        private short departamento;
        private byte seccion;
        private float sueldo;
    //Constructores:
        public Empleado(String nombre,String apellidos,short departamento,
                byte seccion,float sueldo){
            this.nombre=nombre;
            this.apellidos=apellidos;
            this.departamento=departamento;
            this.seccion=seccion;
            this.sueldo=sueldo;
        }
    //Métodos:
        public float getSueldo() {
            return this.sueldo;
        }               
}//Fin Clase

