
package clases;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {new Automovil(4, 200, 4), new Motocicleta(2, 120, true)};

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar();
        }
    }
}