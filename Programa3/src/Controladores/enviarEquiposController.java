package Controladores;

import Modelos.enviarModel;
import Vistas.frmEnviarEquipo;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class enviarEquiposController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmEnviarEquipo VistaEnviar;
    enviarModel ModeloEnviarEquipo;
    public DefaultTableModel TablaEnvioEquipo = new DefaultTableModel();
    
    public enviarEquiposController(frmPrincipal VistaPrincipal, frmEnviarEquipo VistaEnviar, enviarModel ModeloIngresoEquipo){
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEnviar = VistaEnviar;
        this.ModeloEnviarEquipo = ModeloIngresoEquipo;
        
        this.VistaPrincipal.btnEnviarequipo.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        this.TablaEnvioEquipo.addColumn("CODIGO");
        this.TablaEnvioEquipo.addColumn("DESCRIPCION");
        this.TablaEnvioEquipo.addColumn("TECNICO");
        this.TablaEnvioEquipo.addColumn("FECHA DE INGRESO");
        
        this.VistaEnviar.jtEnviarEquipo.setModel(TablaEnvioEquipo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnEnviarequipo)
        {
            this.VistaEnviar.btnEnviar.addActionListener(this);
    
            this.VistaEnviar.setLocationRelativeTo(null);
            this.VistaEnviar.setVisible(true);
        }
        
                if(e.getSource()==this.VistaEnviar.btnEnviar)
        {
            this.ModeloEnviarEquipo.EnviarEquipo(this.VistaEnviar.txtCodigo.getText(), 
                    this.VistaEnviar.txtDescripcion.getText(),
                    this.VistaEnviar.txtTecnico.getText(),
                    this.VistaEnviar.txtFecha.getText());
            this.TablaEnvioEquipo.addRow(new Object[]{this.ModeloEnviarEquipo.EnviarEquipo.get(0).getCodigo(),
            this.ModeloEnviarEquipo.EnviarEquipo.get(0).getDescripcion(),
            this.ModeloEnviarEquipo.EnviarEquipo.get(0).getTecnico(),
            this.ModeloEnviarEquipo.EnviarEquipo.get(0).getFecha()});
        }

    }
}
