
package modelo;


public class Herramientas {
    private int codherramineta;
    private int codtrabajador;
    private String nomherr;
    private String marherr;
    private int precioherr;
    private int exisherr;
    private String proveedor;

    public Herramientas() {
    }

    public Herramientas(int codherramineta, int codtrabajador, String nomherr, String marherr, int precioherr, int exisherr, String proveedor) {
        this.codherramineta = codherramineta;
        this.codtrabajador = codtrabajador;
        this.nomherr = nomherr;
        this.marherr = marherr;
        this.precioherr = precioherr;
        this.exisherr = exisherr;
        this.proveedor = proveedor;
    }

    public int getCodherramineta() {
        return codherramineta;
    }

    public void setCodherramineta(int codherramineta) {
        this.codherramineta = codherramineta;
    }

    public int getCodtrabajador() {
        return codtrabajador;
    }

    public void setCodtrabajador(int codtrabajador) {
        this.codtrabajador = codtrabajador;
    }

    public String getNomherr() {
        return nomherr;
    }

    public void setNomherr(String nomherr) {
        this.nomherr = nomherr;
    }

    public String getMarherr() {
        return marherr;
    }

    public void setMarherr(String marherr) {
        this.marherr = marherr;
    }

    public int getPrecioherr() {
        return precioherr;
    }

    public void setPrecioherr(int precioherr) {
        this.precioherr = precioherr;
    }

    public int getExisherr() {
        return exisherr;
    }

    public void setExisherr(int exisherr) {
        this.exisherr = exisherr;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}