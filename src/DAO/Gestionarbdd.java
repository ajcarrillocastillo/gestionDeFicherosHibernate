/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import gestionDeMovimientos.modelo.Empleado;
import gestionDeMovimientos.modelo.Movimiento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author jesus
 */
public class Gestionarbdd {
      private static Gestionarbdd devolverFunciones = null;
      private List<Empleado> listaDeEmpleados;
      private List<Movimiento> listaDeMovimientos;
      private  Session ss = NewHibernateUtil.getSessionFactory().openSession();
    /**     * Singleton

     * @return
     */
    public static Gestionarbdd devolver() {

        if (devolverFunciones != null) {
            return devolverFunciones;
        } else {
            devolverFunciones = new Gestionarbdd();
            return devolverFunciones;
        }
    }
     public List<Empleado> selectEmpleados() throws SQLException {
        ss.close();
        ss=NewHibernateUtil.getSessionFactory().openSession();
         listaDeEmpleados = new ArrayList<>();
        Empleado empleado;
        //Session ss = NewHibernateUtil.getSessionFactory().openSession();
       Query q = ss.createQuery("from Empleado");
       Iterator<Empleado> it = q.iterate();
        
            while(it.hasNext()){
            empleado = (Empleado) it.next();
             listaDeEmpleados.add(empleado);
        }
         
           
        return listaDeEmpleados;
    }
     public List<Movimiento> selectMovimientos() throws SQLException{
        listaDeMovimientos = new ArrayList<>();
        Movimiento movimiento;
       // Session ss = NewHibernateUtil.getSessionFactory().openSession();
       // ss.beginTransaction();
       Query q = ss.createQuery("from Movimiento");
       Iterator<Movimiento> it = q.iterate();
        
            while(it.hasNext()){
            movimiento = (Movimiento) it.next();
             listaDeMovimientos.add(movimiento);
        }

        return listaDeMovimientos;
     }
   
     public boolean insertarEmpleado(Empleado empleado) {
        try{
        // Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.beginTransaction();
            ss.persist(empleado);
            ss.getTransaction().commit();
                 return true;
                }catch (Exception e) {
                  return false;
             }
             
     }
     public boolean insertarMovimiento(Movimiento movimiento){
     try{
     //    Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.beginTransaction();
            ss.persist(movimiento);
            ss.getTransaction().commit();
                 return true;
                }catch (Exception e) {
                      Logger.getLogger(Gestionarbdd.class.getName()).log(Level.SEVERE, null, e);
                  return false;
             }
         
     }
     public boolean EditarEmpleado(Empleado empleado,String nombre,String apellido){
          try{ 
     //    Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.beginTransaction();
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            ss.getTransaction().commit();
               return true;
                }catch (Exception e) {
                  return false;
             }
                
     }
     public void borrarEmpleado(Empleado empleado){
         
     //    Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.beginTransaction();
            ss.delete(empleado);
            ss.getTransaction().commit();
                
     }
       public void CerrarHibernate(){
     NewHibernateUtil.close();
     }
}
