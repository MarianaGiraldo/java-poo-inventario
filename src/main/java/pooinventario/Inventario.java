package pooinventario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mariana Giraldo
 */
public class Inventario {
    final private List<Vehiculo> vehiculos = new ArrayList<>();

    public void addVehiculo(Vehiculo v) {
        this.vehiculos.add(v);
    }

    public Integer getCantidadDeVehiculos() {
        return this.vehiculos.size();
    }

    @Override
    public String toString() {
        String salida = "Cantidad de vehiculos: " + this.getCantidadDeVehiculos() + "\n";
        for (Vehiculo v : this.vehiculos) {
            salida += "Tipo: " + v.tipo + " | Placa: " + v.placa + 
                    " | Velocidad: " + v.velocidad +  " | Pasajeros: " + v.pasajeros + "\n";
        }
        return salida;
    }

}
