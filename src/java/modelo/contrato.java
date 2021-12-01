
package modelo;

public class contrato {
    
    private int numContrato;
    private int codempleado;
    private String tipopagocontra;
    private String descripagocontra;
    private int cantpagocontra;
    private int salariocontra;
    private String fecinicontra;
    private String fecfincontra;
    private String tipocontra;
    private String cargocontra;

    public contrato() {
    }

    public contrato(int numContrato, int codempleado, String tipopagocontra, String descripagocontra, int cantpagocontra, int salariocontra, String fecinicontra, String fecfincontra, String tipocontra, String cargocontra) {
        this.numContrato = numContrato;
        this.codempleado = codempleado;
        this.tipopagocontra = tipopagocontra;
        this.descripagocontra = descripagocontra;
        this.cantpagocontra = cantpagocontra;
        this.salariocontra = salariocontra;
        this.fecinicontra = fecinicontra;
        this.fecfincontra = fecfincontra;
        this.tipocontra = tipocontra;
        this.cargocontra = cargocontra;
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }

    public int getCodempleado() {
        return codempleado;
    }

    public void setCodempleado(int codempleado) {
        this.codempleado = codempleado;
    }

    public String getTipopagocontra() {
        return tipopagocontra;
    }

    public void setTipopagocontra(String tipopagocontra) {
        this.tipopagocontra = tipopagocontra;
    }

    public String getDescripagocontra() {
        return descripagocontra;
    }

    public void setDescripagocontra(String descripagocontra) {
        this.descripagocontra = descripagocontra;
    }

    public int getCantpagocontra() {
        return cantpagocontra;
    }

    public void setCantpagocontra(int cantpagocontra) {
        this.cantpagocontra = cantpagocontra;
    }

    public int getSalariocontra() {
        return salariocontra;
    }

    public void setSalariocontra(int salariocontra) {
        this.salariocontra = salariocontra;
    }

    public String getFecinicontra() {
        return fecinicontra;
    }

    public void setFecinicontra(String fecinicontra) {
        this.fecinicontra = fecinicontra;
    }

    public String getFecfincontra() {
        return fecfincontra;
    }

    public void setFecfincontra(String fecfincontra) {
        this.fecfincontra = fecfincontra;
    }

    public String getTipocontra() {
        return tipocontra;
    }

    public void setTipocontra(String tipocontra) {
        this.tipocontra = tipocontra;
    }

    public String getCargocontra() {
        return cargocontra;
    }

    public void setCargocontra(String cargocontra) {
        this.cargocontra = cargocontra;
    }
    
    
}
