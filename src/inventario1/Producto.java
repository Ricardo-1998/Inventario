/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario1;

/**
 *
 * @author Ricardo Villeda
 */



public class Producto {
    String nombre;
    int cantidad;
    double precio;
    boolean estado;
    
    
    void Producto(String nombre, int cantidad, double precio, boolean estado ){
    this.cantidad=cantidad;
    this.estado=estado;
    this.nombre=nombre;
    this.precio=precio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado=estado;
    }  
}
