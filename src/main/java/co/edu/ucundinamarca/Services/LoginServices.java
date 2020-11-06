/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.Services;

import co.edu.ucundinamarca.Pojo.Usuario;

/**
 *
 * @author Joseph
 */
public class LoginServices {
    
    public Usuario login(String username, String password){
        if (username.equals("Nicolas") && password.equals("Leo")) {
            Usuario usuario = new Usuario ("Joseph","Montagut","Estudiante");
            return usuario;
        }else{
            return null;
        }
    }
    
}
