package salmontt.ui;

import salmontt.data.GestorEntidades;
import salmontt.model.*;
import javax.swing.JOptionPane;

public class InterfazGrafica {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();

        while (true) {
            String[] opciones = {
                    "Agregar Proveedor",
                    "Agregar Empleado",
                    "Agregar Centro de Cultivo",
                    "Agregar Planta de Proceso",
                    "Mostrar Registros",
                    "Salir"
            };

            int opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción",
                    "Sistema Salmontt",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcion == 0) {
                String id = JOptionPane.showInputDialog("ID del proveedor:");
                String nombre = JOptionPane.showInputDialog("Nombre del proveedor:");
                gestor.agregarEntidad(new Proveedor(id, nombre));

            } else if (opcion == 1) {
                String id = JOptionPane.showInputDialog("ID del empleado:");
                String nombre = JOptionPane.showInputDialog("Nombre del empleado:");
                String cargo = JOptionPane.showInputDialog("Cargo del empleado:");
                gestor.agregarEntidad(new Empleado(id, nombre, cargo));

            } else if (opcion == 2) {
                String codigo = JOptionPane.showInputDialog("Código del centro:");
                String ubicacion = JOptionPane.showInputDialog("Ubicación del centro:");
                gestor.agregarEntidad(new CentroCultivo(codigo, ubicacion));

            } else if (opcion == 3) {
                String nombre = JOptionPane.showInputDialog("Nombre de la planta:");
                int capacidad = Integer.parseInt(
                        JOptionPane.showInputDialog("Capacidad en toneladas:")
                );
                gestor.agregarEntidad(new PlantaProceso(nombre, capacidad));

            } else if (opcion == 4) {
                gestor.mostrarEntidades();

            } else {
                break;
            }
        }
    }
}
