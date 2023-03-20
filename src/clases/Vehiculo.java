
package clases;


abstract class Vehiculo {
    int numRuedas;
    int velocidadMax;

    public Vehiculo(int numRuedas, int velocidadMax) {
        this.numRuedas = numRuedas;
        this.velocidadMax = velocidadMax;
    }

    public void acelerar() {
        System.out.println("El vehículo aceleró a " + this.velocidadMax + " km/h.");
    }
}
