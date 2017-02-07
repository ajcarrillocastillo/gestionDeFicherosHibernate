/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDeMovimientos.controlador;

import DAO.Gestionarbdd;
import gestionDeMovimientos.modelo.Empleado;
import gestionDeMovimientos.modelo.Movimiento;
import gestionDeMovimientos.vista.JDialogInsertadoMovimientos;
import java.awt.Color;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jesus
 */
public class ControladorInsertardoDeMovimientos {

    private List<Empleado> listaDeEmpleados;
    private JDialogInsertadoMovimientos vistaMovimientos;

    public ControladorInsertardoDeMovimientos(List<Empleado> listaDeEmpleado) {
        this.listaDeEmpleados = listaDeEmpleado;
        this.vistaMovimientos = new JDialogInsertadoMovimientos(null, true);
        vistaMovimientos.setControladorAnnadirMovimientos(this);
        vistaMovimientos.getjComboBoxNumeroDeEmpleado().removeAllItems();
        for (Empleado e : this.listaDeEmpleados) {
            vistaMovimientos.getjComboBoxNumeroDeEmpleado().addItem(e.getNumeroDeEmpleado());
        }
        vistaMovimientos.setLocationRelativeTo(null);
        vistaMovimientos.setVisible(true);
    }

    //vaciar campos
    /**
     *
     * @param evt
     * @param seleccion
     */
    public boolean VaciarCampos(JTextField campo, boolean flag) {
        if (flag == false) {
            campo.setText("");
            campo.setForeground(Color.black);
            flag = true;
        }
        return flag;
    }

    public boolean VaciarCampos(JTextArea campo, boolean flag) {
        if (flag == false) {
            campo.setText("");
            campo.setForeground(Color.black);
            flag = true;
        }
        return flag;
    }

    public boolean RellenarCampos(String Texto, JTextField campo, boolean flag) {

        campo.setText(Texto);
        campo.setForeground(Color.GRAY);
        flag = false;
        return flag;
    }

    public boolean RellenarCampos(String Texto, JTextArea campo, boolean flag) {

        campo.setText(Texto);
        campo.setForeground(Color.GRAY);
        flag = false;
        return flag;
    }

    public void limitadorNumeros(java.awt.event.KeyEvent evt) {
        char letra = evt.getKeyChar();
        if (!Character.isDigit(letra)) {
            evt.consume();
        }
    }

    public boolean insertarDatosMovimientos() {
        boolean control=true;
        String importeString= vistaMovimientos.getjTextFieldImporte().getText();
        String tipo= ""+vistaMovimientos.getjComboBoxTipo().getSelectedItem().toString();
        String fecha= vistaMovimientos.getjTextFieldFecha().getText();
        String descripcion=vistaMovimientos.getjTextAreaDescripcion().getText();
        String numeroDeEmpleadoTexto=""+vistaMovimientos.getjComboBoxNumeroDeEmpleado().getSelectedItem().toString();
        if(importeString.isEmpty()||tipo.isEmpty()||fecha.isEmpty()||descripcion.isEmpty()|| numeroDeEmpleadoTexto.isEmpty()){
        control=false;
         JOptionPane.showMessageDialog(vistaMovimientos, "Rellene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                
        }else{
        Pattern pat = Pattern.compile("^((((([0-2][0-9])|(30))\\/(09|04|06|11))|((([0-2][0-9])|(3[0-1]))\\/(01|03|05|07|08|10|12))|((([0-2][0-8]))\\/(02)))\\/\\d{4})|(29\\/02\\/(?:(?:(?:(?:(?:[13579][26]|[2468][048])00)|(?:[0-9]{2}(?:(?:[13579][26])|(?:[2468][048]|0[48])))))))$");
        Matcher mat = pat.matcher(fecha);
        if(!mat.matches()){
         control=false;
         JOptionPane.showMessageDialog(vistaMovimientos, "Ponga la fecha correcta en formato dd/mm/aaaa ", "Error", JOptionPane.ERROR_MESSAGE);
          }
        else{
        double importe= Double.parseDouble(importeString);  
                    control=true;
                    Empleado empleado=new Empleado();
                      for (Empleado e : this.listaDeEmpleados) {
                           if(e.getNumeroDeEmpleado().equals(numeroDeEmpleadoTexto)){
                           empleado=e;
                           }
                          
        }
                    Movimiento movimiento=new Movimiento(importe, tipo, fecha, descripcion, empleado);
                    if(!Gestionarbdd.devolver().insertarMovimiento(movimiento)){
                    JOptionPane.showMessageDialog(vistaMovimientos, "No se ha podido insertar", "Error", JOptionPane.ERROR_MESSAGE);
                    control=false;
                }else{
                JOptionPane.showMessageDialog(vistaMovimientos, "Se han insertado los datos correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                control=true;}
                   
        }
        }
     return control;
    }
}
