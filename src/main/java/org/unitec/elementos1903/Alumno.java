/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import java.util.List;

/**
 *
 * @author campitos
 */
public class Alumno {
    private Integer cuenta;
    private String nombre;
    private List<Materia> materias;
    private String email;

    public Alumno(Integer cuenta, String nombre, List<Materia> materias, String email) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.materias = materias;
        this.email = email;
    }

    public Alumno() {
    }

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
