/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

/**
 *
 * @author campitos
 */
public class Profesor {
    private Integer Clave;

    public Profesor(Integer Clave, String Nombre, String Email) {
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.Email = Email;
    }

    public Profesor() {
    }
    private String Nombre;
    private String Email;

    public Integer getClave() {
        return Clave;
    }

    public void setClave(Integer Clave) {
        this.Clave = Clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
