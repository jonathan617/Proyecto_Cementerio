
package modelo;


public class login {
    private int codigo;
    private String rol;
    private String usuario;
    private String clave;
    private String nombre;

    public login(int codigo, String rol, String usuario, String clave, String nombre) {
        this.codigo = codigo;
        this.rol = rol;
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
    }

    public login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
