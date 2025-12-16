package salmontt.model;

public class Proveedor implements Registrable {

    private String id;
    private String nombre;

    public Proveedor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Proveedor - ID: " + id + ", Nombre: " + nombre);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
