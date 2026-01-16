public class Principal {
    static void main(String[] args) {
        Persona objPersona1 = new Persona("Eduardo", 41, 95, 1.75);
                //new crea objeto,
        System.out.println(objPersona1);
        System.out.println("Nombre: " + objPersona1.getNombre());
        System.out.println("Edad: " + objPersona1.getEdad());
        System.out.println("Peso: " + objPersona1.getPeso());
        System.out.println("Altura: " + objPersona1.getAltura());
        System.out.println("IMC: " + objPersona1.calcIMC());

        objPersona1.setNombre("Ernesto");
        objPersona1.setEdad(42);
        objPersona1.setPeso(96);
        objPersona1.setAltura(1.48);

        System.out.println(objPersona1);
        System.out.println("Nombre: " + objPersona1.getNombre());
        System.out.println("Edad: " + objPersona1.getEdad());
        System.out.println("Peso: " + objPersona1.getPeso());
        System.out.println("IMC: " + objPersona1.calcIMC());
    }
}
