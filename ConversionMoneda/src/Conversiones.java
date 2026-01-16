import java.util.Scanner;

public class Conversiones {
    //Atributos
    private Scanner leer = new Scanner(System.in);
    private int tipoMoneda;
    private double cantidadMoneda;
    private double resultadoYenes, resultadoEuro, resultadoDolares, resultadoPesos;

    public void leerTipo(){
        System.out.println("Escriba el tipo de moneda a convertir: " + "\n1.- Pesos \n2.- Yenes\n 3.- Euro \n 4.- Dolares 5.- Salir");
        tipoMoneda = leer.nextInt();
    }
    public double convertir() {
        //falta cantidad de moneda
        System.out.println("EScriba la cantidad de monedas a convertir: ");
        cantidadMoneda = leer.nextDouble();
        switch(tipoMoneda){
            case 1:
                resultadoYenes = cantidadMoneda * 8.49;
                resultadoEuro = cantidadMoneda * 0.049;
                resultadoDolares = cantidadMoneda * 0.057;
                System.out.println("A Yenes: " +resultadoYenes+ "\nA Euro: " +resultadoEuro+"\nA Dolares: "+resultadoDolares);
                break;
            case 2:
                resultadoPesos = cantidadMoneda * 0.11;
                resultadoEuro = cantidadMoneda * 0.0055;
                resultadoDolares = cantidadMoneda * 0.0063;
                break;
            case 3:

        }
    }
}
