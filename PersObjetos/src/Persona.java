public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private double peso,altura;
    public Persona(String nombre, int edad, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    //getter setter - click derecho - generar - getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //comportamiento
    public double calcIMC(){
        return peso/Math.pow(altura,2);
    }


}
