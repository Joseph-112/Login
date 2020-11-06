/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.Pojo;

import java.io.Serializable;

/**
 *
 * @author Joseph
 */
public class Usuario implements Serializable{
    
    private String username;
    private String lastName;
    private String rol;

    public Usuario(){        
    }

    public Usuario(String username, String lastName, String rol) {
        this.username = username;
        this.lastName = lastName;
        this.rol = rol;
    }  
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
