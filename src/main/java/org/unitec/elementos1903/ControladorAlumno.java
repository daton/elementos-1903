/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class ControladorAlumno {
    //Método para Guardar

    @Autowired
    RepoAlumno repoAlumno;

    
    //Guardar
    @PostMapping("/alumno")
    public Estatus guardar(@RequestBody String json) throws Exception {
        //Primero  vamos a recibir el json del cliente web Y lo transformamos
        //a un objeto Java  con la clase ObjectMapper
        ObjectMapper maper = new ObjectMapper();
        //Ahora si lo leemos
        Alumno alumno = maper.readValue(json, Alumno.class);

        repoAlumno.save(alumno);
        //Generamos el status
        Estatus e = new Estatus();
        e.setMensaje("Alumno guardado con exito");
        e.setSuccess(true);

        return e;

    }
    //Buscar todos
    @GetMapping("/alumno")
    public List<Alumno> buscarTodos(){
       return repoAlumno.findAll();
    }
    
    //Borrar
    @DeleteMapping("/alumno/{id}")
    public Estatus borrar(@PathVariable String id){
        repoAlumno.deleteById(id);
        Estatus e=new Estatus();
        e.setSuccess(true);
        e.setMensaje("Profesor borradon con exito");
        return e;
        
    }
    
    //Actualizar
    @PutMapping("/alumno")
    public Estatus actualizar(@RequestBody String json)throws Exception{
         //Primero  vamos a recibir el json del cliente web Y lo transformamos
        //a un objeto Java  con la clase ObjectMapper
        ObjectMapper maper = new ObjectMapper();
        //Ahora si lo leemos
        Alumno alumno = maper.readValue(json, Alumno.class);

        
        //Generamos el status
        Estatus e = new Estatus();
        e.setMensaje("Profe guardado con exito");
        e.setSuccess(true);

        return e;
    }
    //BUscar por ID
    @GetMapping("/alumno/{id}")
    public Alumno buscarPorId(@PathVariable String id){
        
       return repoAlumno.findById(id).get();
    }
    
    
}
