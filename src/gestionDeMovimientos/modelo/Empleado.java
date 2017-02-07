/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDeMovimientos.modelo;


import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;



/**
 *
 * @author jesus
 */
@Entity
@Table(name = "empleado",catalog = "empresahibernate")
public class Empleado implements Serializable {
    @Id
     @GenericGenerator(name = "generator", strategy ="increment")
    @GeneratedValue(generator = "generator")
    
    private int numeroDeEmpleado;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @OneToMany(mappedBy = "empleado",cascade=CascadeType.ALL )
    private List<Movimiento> listaDeMovimientos;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Empleado(String nombre, String apellido, List<Movimiento> listaDeMovimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaDeMovimientos = listaDeMovimiento;
    }

    public Empleado(int numeroDeEmpleado, String nombre, String apellido) {
        this.numeroDeEmpleado = numeroDeEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado(int numeroDeEmpleado, String nombre, String apellido, List<Movimiento> listaDeMovimientos) {
        this.numeroDeEmpleado = numeroDeEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaDeMovimientos = listaDeMovimientos;
    }
    

    public String getNumeroDeEmpleado() {
        String numeroEmpleadoString=""+numeroDeEmpleado;
        return numeroEmpleadoString;
    }

    public void setNumeroDeEmpleado(String numeroDeEmpleado) {
        this.numeroDeEmpleado = Integer.parseInt(numeroDeEmpleado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Movimiento> getListaDeMovimientos() {
        return listaDeMovimientos;
    }

    public void setListaDeMovimientos(List<Movimiento> listaDeMovimientos) {
        this.listaDeMovimientos = listaDeMovimientos;
    }

    public void addListaDeMovimientos(Movimiento movimiento) {
        this.listaDeMovimientos.add(movimiento);
    }

}
