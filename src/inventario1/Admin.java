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
public class Admin {
    String nombre, usuario, password;
    
    void Admin(){}
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getUsurio(){
        return usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    
    public String getPassword(){
        return password;
        
    }
    
    public void setPassword(String password){
        this.password=password;
    }
}
