package Dispositivos;

public class Main {
    public static void main(String[] args) {

        SmartiDevice.SmartPhone movil1 = new SmartiDevice.SmartPhone("5 pulgadas",
                " 5 gb", "solo wi-fi");

        SmartiDevice.SmartWatch reloj1 = new SmartiDevice.SmartWatch("No resiste agua",
                "bluetooth");

        System.out.println("Las caracteristicas del movil1 son " + movil1.tamañoPantalla + " tamaño de " +
                "pantalla " + " y se conecta " + movil1.tipoConexion);
        System.out.println("Las caracteristicas del reloj1 son " + reloj1.resistenteAgua + " tamaño de " +
                "pantalla " + " y se conecta " + reloj1.tipoConexion);
    }
}
