package pooinventario;

/**
 *
 * @author Mariana Giraldo
 */
public class Vehiculo {
    protected String tipo;
    protected String placa;
    protected Double velocidad;
    protected int pasajeros;

    public Vehiculo(String tipo, String placa, Double velocidad, int pasajeros) {
        this.tipo = tipo;
        this.placa = placa;
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
    }
}
