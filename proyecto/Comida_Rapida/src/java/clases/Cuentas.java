
package clases;

import java.io.Serializable;

 
public class Cuentas implements Serializable{
    
    private Integer idUsuario;
    private String nombre;
    private String cuenta;
    private String password;

    public Cuentas(Integer idUsuario, String nombre, String cuenta, String password) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.password = password;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

     

    @Override
    public String toString() {
        return "Cuentas{" + "nombre=" + nombre +  ", cuenta=" + cuenta + ", password=" + password  + '}';
    }

    public Cuentas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 
}
