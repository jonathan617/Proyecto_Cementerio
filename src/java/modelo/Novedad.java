
package modelo;


public class Novedad {
    private int codnove;
    private int codemple;
    private String fecnove;
    private String descrinove;
    private String estnove;

    public Novedad() {
    }

    public Novedad(int codnove, int codemple, String fecnove, String descrinove, String estnove) {
        this.codnove = codnove;
        this.codemple = codemple;
        this.fecnove = fecnove;
        this.descrinove = descrinove;
        this.estnove = estnove;
    }

    public int getCodnove() {
        return codnove;
    }

    public void setCodnove(int codnove) {
        this.codnove = codnove;
    }

    public int getCodemple() {
        return codemple;
    }

    public void setCodemple(int codemple) {
        this.codemple = codemple;
    }

    public String getFecnove() {
        return fecnove;
    }

    public void setFecnove(String fecnove) {
        this.fecnove = fecnove;
    }

    public String getDescrinove() {
        return descrinove;
    }

    public void setDescrinove(String descrinove) {
        this.descrinove = descrinove;
    }

    public String getEstnove() {
        return estnove;
    }

    public void setEstnove(String estnove) {
        this.estnove = estnove;
    }
}

