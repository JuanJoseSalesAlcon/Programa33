package Controladores;

import Modelos.entregarModel;
import Vistas.frmEntregaEquipos;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class entregarEquiposController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmEntregaEquipos VistaEntregar;
    entregarModel ModeloEntregar;
    public DefaultTableModel TablaEntregaEquipo = new DefaultTableModel();
    
    public entregarEquiposController(frmPrincipal VistaPrincipal, frmEntregaEquipos VistaEntregar, entregarModel ModeloEntregar){
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEntregar = VistaEntregar;
        this.ModeloEntregar = ModeloEntregar;
        
        this.VistaPrincipal.btnEntregar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        this.TablaEntregaEquipo.addColumn("CODIGO");
        this.TablaEntregaEquipo.addColumn("DESCRIPCION");
        this.TablaEntregaEquipo.addColumn("TECNICO");
        this.TablaEntregaEquipo.addColumn("FECHA DE INGRESO");
        
        this.VistaEntregar.jtEntregarEquipo.setModel(TablaEntregaEquipo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnEntregar)
        {
            this.VistaEntregar.btnEntregarEquipos.addActionListener(this);
    
            this.VistaEntregar.setLocationRelativeTo(null);
            this.VistaEntregar.setVisible(true);
        }
        
                if(e.getSource()==this.VistaEntregar.btnEntregarEquipos)
        {
            this.ModeloEntregar.AgregarEntrega(this.VistaEntregar.txtCodigoEquipo.getText(), 
                    this.VistaEntregar.txtNombrePersona.getText(), 
                    this.VistaEntregar.txtFechaEntrega.getText(),
                    this.VistaEntregar.txtDescripcionProblema.getText());
            this.TablaEntregaEquipo.addRow(new Object[]{this.ModeloEntregar.ListarEntregas.get(0).getCodigoEquipo(),
            this.ModeloEntregar.ListarEntregas.get(0).getNombrePersona(),
            this.ModeloEntregar.ListarEntregas.get(0).getFechaEntrega(),
            this.ModeloEntregar.ListarEntregas.get(0).getDescripcionProblema()});
        }

    }
}
