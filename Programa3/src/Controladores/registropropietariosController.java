/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.registropropietariosModel;
import Vistas.frmIngresoPropietarios;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USUARIO
 */
public class registropropietariosController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmIngresoPropietarios VistaIngresoPropietarios;
    registropropietariosModel ModeloIngresoPropietarios;
    public DefaultTableModel TablaIngresoPropietarios = new DefaultTableModel();
    
    public registropropietariosController(frmPrincipal VistaPrincipal, frmIngresoPropietarios VistaIngresoPropietarios, registropropietariosModel ModeloIngresoPropietarios){
        this.VistaPrincipal = VistaPrincipal;
        this.VistaIngresoPropietarios = VistaIngresoPropietarios;
        this.ModeloIngresoPropietarios = ModeloIngresoPropietarios;
        
        this.VistaPrincipal.btnRegistroPropietarios.addActionListener(this);
         
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        this.TablaIngresoPropietarios.addColumn("APELLIDOS");
        this.TablaIngresoPropietarios.addColumn("NOMBRE");
        this.TablaIngresoPropietarios.addColumn("TELEFONO");
        
        this.VistaIngresoPropietarios.jtPropietarios.setModel(TablaIngresoPropietarios);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==this.VistaPrincipal.btnRegistroPropietarios)
        {
            this.VistaIngresoPropietarios.btnIngresarPropietario.addActionListener(this);
            
            this.VistaIngresoPropietarios.setLocationRelativeTo(null);
            this.VistaIngresoPropietarios.setVisible(true);
        }
        
        if(e.getSource()==this.VistaIngresoPropietarios.btnIngresarPropietario)
        {
            this.ModeloIngresoPropietarios.AgregarPropietarios(this.VistaIngresoPropietarios.txtApellidos.getText(), 
                    this.VistaIngresoPropietarios.txtNombre.getText(), 
                    this.VistaIngresoPropietarios.txtTelefono.getText());
            this.TablaIngresoPropietarios.addRow(new Object[]{this.ModeloIngresoPropietarios.ListaPropietarios.get(0).getApellido(),
            this.ModeloIngresoPropietarios.ListaPropietarios.get(0).getNombre(),
            this.ModeloIngresoPropietarios.ListaPropietarios.get(0).getTelefono()});
        }
    }
    
}
