package pooinventario;

import java.util.Scanner;

/**
 *
 * @author Mariana Giraldo
 */
public class PooInventario {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        System.out.println("Digite los datos utiizando el siguiente formato:\nOpción&Tipo&Placa&Velocidad&Pasajeros&Color ó Opción&Tipo&Placa&Velocidad&Pasajeros&Carga");
        
        try (Scanner scanner = new Scanner(System.in)) {
            loop: while (true) {
                String stdin = scanner.nextLine();
                if (stdin.isEmpty()) {
                    // If the input is empty, exit the loop
                    break;
                }
                String option = stdin.substring(0, 1);
                System.out.println("Opcion elegida: " + option);
                switch (option) {
                    case "1" -> {
                        String[] elements = stdin.split("&");
                        if (elements.length != 6) {
                            System.out.println("Las entradas no son válidas");
                            continue;
                        }
                        Vehiculo vehiculo = null;
                        switch (elements[1].toLowerCase()) {
                        case "particular" -> vehiculo = new Particular(elements[1], elements[2], Double.valueOf(elements[3]), Integer.parseInt(elements[4]), elements[5]);
                        case "publico" -> vehiculo = new Publico(elements[1], elements[2], Double.valueOf(elements[3]), Integer.parseInt(elements[4]), elements[5]);
                        default -> {
                            System.out.println("Tipo de vehiculo no existe"); 
                            continue;
                        }
                    }
                        inventario.addVehiculo(vehiculo);
                        break;
                    }
                    case "2" -> System.out.println(inventario.toString());
                    case "3" -> {
                        break loop;
                    }
                    default -> {
                        System.out.println("Opción incorrecta");
                        continue;
                    }
                }
            }
        }
    }
}
