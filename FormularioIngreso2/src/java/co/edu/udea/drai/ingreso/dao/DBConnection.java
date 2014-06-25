/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.drai.ingreso.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
 import java.sql.Driver;
 import java.sql.DriverManager;
import java.sql.PreparedStatement;
 import java.sql.SQLException;
import java.sql.Statement;
 
 public class DBConnection
 {
   private Connection conexion;
 
   public DBConnection(String driver, String host, String usuario, String clave)
     throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException
   {
     DriverManager.registerDriver((Driver)Class.forName(driver).newInstance());
    this.conexion = DriverManager.getConnection(host, usuario, clave);
   }
 
  public Statement getStatement()
    throws SQLException
  {
    return this.conexion.createStatement();
  }
 
   public CallableStatement getCallableStatement(String sql)
    throws SQLException
   {
     return this.conexion.prepareCall(sql);
   }

  public PreparedStatement getPreparedStatement(String sql)
    throws SQLException
   {
     return this.conexion.prepareStatement(sql);
  }
 
   public void cerrarConexion()
     throws SQLException
  {
    if (this.conexion != null)
      this.conexion.close();
   }
 }