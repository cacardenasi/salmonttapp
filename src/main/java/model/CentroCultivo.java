package salmontt.model;

public class CentroCultivo implements Registrable {

    private String codigo;
    private String ubicacion;

    public CentroCultivo(String codigo, String ubicacion) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Centro de Cultivo - Código: " + codigo + ", Ubicación: " + ubicacion);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
