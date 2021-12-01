
package modelo;

public class certificacion {
    
    private int codigo;
    private int numcontrato;
    private String motivo;

    public certificacion() {
    }

    public certificacion(int codigo, int numcontrato, String motivo) {
        this.codigo = codigo;
        this.numcontrato = numcontrato;
        this.motivo = motivo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumcontrato() {
        return numcontrato;
    }

    public void setNumcontrato(int numcontrato) {
        this.numcontrato = numcontrato;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}
