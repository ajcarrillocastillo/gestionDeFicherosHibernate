/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDeMovimientos.modelo;


import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "movimiento",catalog = "empresahibernate")
public class Movimiento implements Serializable {
    @Id
    @Column(name="movimientosID")
      @GenericGenerator(name = "generator", strategy ="increment")
    @GeneratedValue(generator = "generator")
    private int numeroDeMovimiento;
    @Column(nullable = false)
    private double Importe;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private String fecha;
    @Column(nullable = false)
    private String descripcion;
    @ManyToOne(targetEntity = Empleado.class )
    //@JoinColumn(name = "numerodeempleado") 
    private Empleado empleado;

    public Movimiento() {
    }

    public Movimiento(double Importe, String tipo, String fecha, String descripcion, Empleado empleado) {
        this.Importe = Importe;
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.empleado = empleado;
    }

    
    public Movimiento(int numeroDeMovimiento, double Importe, String tipo, String fecha, String descripcion, Empleado empleado) {
        this.numeroDeMovimiento = numeroDeMovimiento;
        this.Importe = Importe;
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.empleado = empleado;
    }

    public String getNumeroDeMovimiento() {
        String stringNumeroDeMovimiento=""+numeroDeMovimiento;
        return stringNumeroDeMovimiento;
    }

    public void setNumeroDeMovimiento(String numeroDeMovimiento) {
        
        this.numeroDeMovimiento =Integer.parseInt(numeroDeMovimiento);
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return /*NumeroDeMovimiento:0*/ getNumeroDeMovimiento() + "|"/*Importe:1*/ + getImporte() + "|"/*Fecha:2*/ + getFecha() + "|"/*Descripcion3*/ + getDescripcion() + "|"/*NumeroDeEmpleado:4*/ + getEmpleado().getNumeroDeEmpleado();
    }
}