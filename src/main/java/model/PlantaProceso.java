package salmontt.model;

public class PlantaProceso implements Registrable {

    private String nombre;
    private int capacidad;

    public PlantaProceso(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println(
                "Planta de Proceso - Nombre: " + nombre +
                        ", Capacidad: " + capacidad + " toneladas"
        );
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
