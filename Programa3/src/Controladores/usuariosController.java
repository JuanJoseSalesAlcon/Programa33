/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.usuariosModel;
import Vistas.frmIngresoEquipo;
import Vistas.frmIngresoPropietarios;
import Vistas.frmPrincipal;
import Vistas.frmUsuarios;
import Vistas.frmEntregaEquipos;
import Vistas.frmEnviarEquipo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO 2
 */
public class usuariosController implements ActionListener{
frmPrincipal VistaPrincipal;
frmUsuarios VistaUsuarios;
usuariosModel ModeloUsuarios;
frmIngresoEquipo IngresoEquipos;
frmIngresoPropietarios IngresoPropietarios;
public DefaultTableModel TablaUsuarios = new DefaultTableModel();
    
//LEVANTAR DE FORMA AUTOMATICA EL FORMULARIO PRINCIPAL
//----------------------------------------------------

    public usuariosController(frmPrincipal VistaPrincipal, frmUsuarios VistaUsuarios, usuariosModel ModeloUsuarios) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaUsuarios = VistaUsuarios;
        this.ModeloUsuarios = ModeloUsuarios;
        
        //PONER A LA ESCUCHA LOS BOTONES CORRESPONDIENTES
        this.VistaPrincipal.btnPruebaxd.addActionListener(this);
        
        //LEVANTAR LA VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        this.TablaUsuarios.addColumn("APELLIDOS");
        this.TablaUsuarios.addColumn("NOMBRES");
        this.TablaUsuarios.addColumn("TELEFONO");
            
        this.VistaUsuarios.jtUsuarios.setModel(TablaUsuarios);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnIngresoEquipo)
        {
            //PONER A LA ESCUCHA LOS BOTONES DE LA VISTA USUARIOS
            this.VistaUsuarios.btnInsertar.addActionListener(this);
            //LEVANTAR LA VISTA USUARIOS
            this.VistaUsuarios.setLocationRelativeTo(null);
            this.VistaUsuarios.setVisible(true);
        }
        
        if(e.getSource()==this.VistaUsuarios.btnInsertar)
        {
            this.ModeloUsuarios.AgregarUsuarios(this.VistaUsuarios.txtApellidos.getText(), 
                    this.VistaUsuarios.txtNombre.getText(), 
                    this.VistaUsuarios.txtTelefono.getText());
            this.TablaUsuarios.addRow(new Object[]{this.ModeloUsuarios.ListaUsuarios.get(0).getApellidos(),
            this.ModeloUsuarios.ListaUsuarios.get(0).getNombre(),
            this.ModeloUsuarios.ListaUsuarios.get(0).getTelefono()});
        }
    }
    
}
