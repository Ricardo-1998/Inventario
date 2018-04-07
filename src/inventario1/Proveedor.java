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
public class Proveedor {
    String nombre, telefono, empresa, email;
    
    void Proveedor(){}
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getEmpresa(){
        return empresa;
    }
    
    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }
}

