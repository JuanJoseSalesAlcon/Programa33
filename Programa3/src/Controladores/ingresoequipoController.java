package Controladores;

import Modelos.ingresoequipoModel;
import Vistas.frmIngresoEquipo;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ingresoequipoController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmIngresoEquipo VistaIngresoEquipo;
    ingresoequipoModel ModeloIngresoEquipo;
    public DefaultTableModel TablaIngresoEquipo = new DefaultTableModel();
    
    public ingresoequipoController(frmPrincipal VistaPrincipal, frmIngresoEquipo VistaIngresoEquipo, ingresoequipoModel ModeloIngresoEquipo){
        this.VistaPrincipal = VistaPrincipal;
        this.VistaIngresoEquipo = VistaIngresoEquipo;
        this.ModeloIngresoEquipo = ModeloIngresoEquipo;
        
        this.VistaPrincipal.btnIngresoEquipo.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        this.TablaIngresoEquipo.addColumn("MARCA");
        this.TablaIngresoEquipo.addColumn("MODELO");
        this.TablaIngresoEquipo.addColumn("TIPO COMPUTADORA");
        this.TablaIngresoEquipo.addColumn("PROBLEMA");
        
        this.VistaIngresoEquipo.jtIngresoEquipo.setModel(TablaIngresoEquipo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnIngresoEquipo)
        {
            this.VistaIngresoEquipo.btnIngresarPC.addActionListener(this);
    
            this.VistaIngresoEquipo.setLocationRelativeTo(null);
            this.VistaIngresoEquipo.setVisible(true);
        }
        
                if(e.getSource()==this.VistaIngresoEquipo.btnIngresarPC)
        {
            this.ModeloIngresoEquipo.AgregarEquipo(this.VistaIngresoEquipo.txtMarca.getText(), 
                    this.VistaIngresoEquipo.txtModelo.getText(), 
                    this.VistaIngresoEquipo.txtTipoComputadora.getText(),
                    this.VistaIngresoEquipo.txtProblemaPresentado.getText());
            this.TablaIngresoEquipo.addRow(new Object[]{this.ModeloIngresoEquipo.ListaIngresos.get(0).getMarca(),
            this.ModeloIngresoEquipo.ListaIngresos.get(0).getModelo(),
            this.ModeloIngresoEquipo.ListaIngresos.get(0).getTipocomputadora(),
            this.ModeloIngresoEquipo.ListaIngresos.get(0).getProblema()});
        }

    }
}
