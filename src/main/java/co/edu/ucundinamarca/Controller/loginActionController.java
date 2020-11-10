/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.Controller;

import co.edu.ucundinamarca.Pojo.Usuario;
import co.edu.ucundinamarca.Services.LoginServices;
import java.io.IOException;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Joseph
 */
@Named(value = "loginActionController")
@RequestScoped
public class loginActionController implements Serializable {

    private String username;
    private String password;

    /**
     *
     */
    /**
     * Creates a new instance of loginActionController
     */
    public loginActionController() {

    }

    public void Login() {
        System.out.println("Entro " + username + " " + password);
        LoginServices service = new LoginServices();
        Usuario user = service.login(username, password);
        FacesContext context = FacesContext.getCurrentInstance();
        if (user != null) {
            context.addMessage(null, new FacesMessage("Exito", "Bienvenido " + user.getUsername() + " " + user.getLastName() + " " + user.getRol()));
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Usuario y Contraseña incorrecto"));

        }
    }

    public void Validate() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("faces/loginAction2");
    }

    /**
     * Obtener username
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Asignar valor a variable username
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtener contraseña
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Asignar valor a variable password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
