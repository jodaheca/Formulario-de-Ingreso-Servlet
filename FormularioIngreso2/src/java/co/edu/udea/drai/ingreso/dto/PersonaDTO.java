/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.drai.ingreso.dto;

/**
 *
 * @author Usuario
 */
public class PersonaDTO {
    String nombre ;
         String apellido; 
         String id ; 
         String correo;  
         String programa; 

    public PersonaDTO(String nombre, String apellido, String id, String correo, String programa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.correo = correo;
        this.programa = programa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPrograma() {
        return programa;
    }
    
}
