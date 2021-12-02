
public class Marca {

    private String marcaM;
    private int referencia;
    private int cantidad;

    public Marca(String marcaM, int referencia, int cantidad) {
        this.marcaM = marcaM;

    }

    public Marca() {

    }

    public String getMarca() {
        return marcaM;
    }

    public void setMarca(String marca) {
        this.marcaM = marcaM;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
