/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.Controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Joseph
 */
@Named(value = "loginActionController2")
@RequestScoped
public class loginActionController2 implements Serializable {

    private String username;
    private String password;
    
    @Inject
    private loginActionController controller;
    /**
     * Creates a new instance of loginActionController2
     */
    public loginActionController2() {
        System.out.println("Ingreso al login action 2");
    }

    @PostConstruct
    public void init(){
        System.out.println(controller.getUsername()+"  "+controller.getPassword());
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
