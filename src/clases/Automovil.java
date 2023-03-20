
package clases;

class Automovil extends Vehiculo {
    int cantPuertas;

    public Automovil(int numRuedas, int velocidadMax, int cantPuertas) {
        super(numRuedas, velocidadMax);
        this.cantPuertas = cantPuertas;
    }

    @Override
    public void acelerar() {
        System.out.println("El automóvil aceleró a " + this.velocidadMax + " km/h.");
    }
}
