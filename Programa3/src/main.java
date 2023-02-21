
import Controladores.ingresoequipoController;
import Controladores.registropropietariosController;
import Controladores.usuariosController;
import Controladores.entregarEquiposController;
import Controladores.enviarEquiposController;
import Modelos.ingresoequipoModel;
import Modelos.registropropietariosModel;
import Modelos.usuariosModel;
import Modelos.entregarModel;
import Modelos.enviarModel;
import Vistas.frmIngresoEquipo;
import Vistas.frmIngresoPropietarios;
import Vistas.frmPrincipal;
import Vistas.frmUsuarios;
import Vistas.frmEntregaEquipos;
import Vistas.frmEnviarEquipo;

public class main {

    public static void main(String[] args) {
    
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmUsuarios VistaUsuarios = new frmUsuarios(VistaPrincipal,true);
        frmEntregaEquipos VistaEntregar = new frmEntregaEquipos(VistaPrincipal, true);
        frmEnviarEquipo VistaEnviar = new frmEnviarEquipo(VistaPrincipal, true);
        usuariosModel ModeloUsuarios = new usuariosModel();
        
        frmIngresoEquipo VistaIngresoEquipo = new frmIngresoEquipo(VistaPrincipal,true);
        ingresoequipoModel ModeloIngresoEquipo = new ingresoequipoModel();
        
        //EntregarEquipos
        frmEntregaEquipos EntregaEquipos = new frmEntregaEquipos(VistaPrincipal,true);
        entregarModel ModeloEntregar = new entregarModel();
        entregarEquiposController EntregarEquipos = new entregarEquiposController(VistaPrincipal, VistaEntregar, ModeloEntregar);
        
        //EnviarEquipos
        frmEnviarEquipo EnviarEquipo = new frmEnviarEquipo(VistaPrincipal,true);
        enviarModel ModeloEnviar = new enviarModel();
        enviarEquiposController EnviarEquipos = new enviarEquiposController(VistaPrincipal, VistaEnviar, ModeloEnviar);
        
        frmIngresoPropietarios VistaIngresoPropietarios = new frmIngresoPropietarios(VistaPrincipal,true);
        registropropietariosModel ModeloRegistroPropietarios = new registropropietariosModel();
        
        usuariosController ControladorUsuarios = new usuariosController(VistaPrincipal,VistaUsuarios,ModeloUsuarios);
        ingresoequipoController ControladorIngresoEquipos = new ingresoequipoController(VistaPrincipal, VistaIngresoEquipo, ModeloIngresoEquipo);
        registropropietariosController ControladorPropietarios = new registropropietariosController(VistaPrincipal, VistaIngresoPropietarios, ModeloRegistroPropietarios);
        
    }
    
}
