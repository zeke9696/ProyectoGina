/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.io.Serializable;
/**
 *
 * @author Alfem
 */
public class Pedido {
    
    private Integer id;
    private String nombre;
    private String pedido;
    private Integer precioTotal;
    private String Edificio;
    private String Salon;
    private String Hora;
    private Integer pago;
    private Integer estado;

    public Pedido(Integer id,String nombre,String pedido, Integer precioTotal,String Edificio, String Salon, String Hora,Integer pago,Integer estado) {
        this.id = id;
        this.nombre = nombre;
        this.pedido = pedido;
        this.precioTotal = precioTotal;
        this.Edificio = Edificio;
        this.Salon = Salon;
        this.Hora = Hora;
        this.pago = pago;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre  + ", pedido=" + pedido + ", precioTotal=" + precioTotal + ", Edificio=" + Edificio 
                + ", Salon=" + Salon + ", Hora=" + Hora + ", pago=" + pago + ", estado=" + estado + '}';
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPedido() {
        return pedido;
    }
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public Integer getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(Integer precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public String getEdificio() {
        return Edificio;
    }
    public void setEdificio(String Edificio) {
        this.Edificio = Edificio;
    }
    
    public String getSalon() {
        return Salon;
    }
    public void setSalon(String salon) {
        this.Salon = salon;
    }
    
    public String getHora() {
        return Hora;
    }
    public void setHora(String hora) {
        this.Hora = hora;
    }
    
    public Integer getPago() {
        return pago;
    }
    public void setPago(Integer pago) {
        this.pago = pago;
    }
    
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
