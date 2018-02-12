/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.io.Serializable;

/**
 *
 * @author Darci
 */
public class Producto implements Serializable{
    
    private Integer id;
    private String nombre;
    private Integer existencia;
    private Integer precio;

    public Producto(Integer id,String nombre, Integer precio, Integer existencia) {
        this.id = id;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre  + ", precio=" + precio + ", existencia=" + existencia + '}';
    }
    
   
    public String getNombre() {
        return nombre;
    }

   

    public Integer getExistencia() {
        return existencia;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
}
