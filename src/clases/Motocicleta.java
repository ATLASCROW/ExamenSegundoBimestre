
package clases;


class Motocicleta extends Vehiculo {
    boolean conCasco;

    public Motocicleta(int numRuedas, int velocidadMax, boolean conCasco) {
        super(numRuedas, velocidadMax);
        this.conCasco = conCasco;
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta aceleró a " + this.velocidadMax + " km/h.");
    }
}