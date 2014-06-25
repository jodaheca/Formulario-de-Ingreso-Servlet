/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.drai.ingreso.dao;

import co.edu.udea.drai.ingreso.dto.PersonaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class PersonaDAO {
   private BDConexion conexion;
   private Connection connection;
 
   public PersonaDAO()
   {
     this.conexion = new BDConexion();
   }
   
   public void ingresarPersona(PersonaDTO p)
   {
     try
     {
        connection = this.conexion.getConnection();
       PreparedStatement ps = connection.prepareStatement(BDConexion.getStatement("ingresarPersona"));
 
       ps.setString(1, p.getNombre());
       ps.setString(2, p.getApellido());
       ps.setString(3, p.getId());
       ps.setString(4, p.getCorreo());
       ps.setString(5, p.getPrograma());
       ps.executeUpdate();
       ps.close();
     }
     catch (SQLException e){
         System.out.println("Error en el ingreso de la persona a la DB");
         System.out.println(e.toString());
     }
   }
}
