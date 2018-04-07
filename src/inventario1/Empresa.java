/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario1;

/**
 * nombre, direccion, telefono, lista de productos
 * @author Ricardo Villeda
 */
public class Empresa {
    String nombre, direccion, telefono;
    
    
    
    void Empresa(){}
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public String getTelefono(){
        return telefono=telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
}
