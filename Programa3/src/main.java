
import Controladores.ingresoequipoController;
import Controladores.registropropietariosController;
import Controladores.usuariosController;
import Modelos.ingresoequipoModel;
import Modelos.registropropietariosModel;
import Modelos.usuariosModel;
import Vistas.frmIngresoEquipo;
import Vistas.frmIngresoPropietarios;
import Vistas.frmPrincipal;
import Vistas.frmUsuarios;

public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmUsuarios VistaUsuarios = new frmUsuarios(VistaPrincipal,true);
        usuariosModel ModeloUsuarios = new usuariosModel();
        
        frmIngresoEquipo VistaIngresoEquipo = new frmIngresoEquipo(VistaPrincipal,true);
        ingresoequipoModel ModeloIngresoEquipo = new ingresoequipoModel();
        
        frmIngresoPropietarios VistaIngresoPropietarios = new frmIngresoPropietarios(VistaPrincipal,true);
        registropropietariosModel ModeloRegistroPropietarios = new registropropietariosModel();
        
        usuariosController ControladorUsuarios = new usuariosController(VistaPrincipal,VistaUsuarios,ModeloUsuarios);
        ingresoequipoController ControladorIngresoEquipos = new ingresoequipoController(VistaPrincipal, VistaIngresoEquipo, ModeloIngresoEquipo);
        registropropietariosController ControladorPropietarios = new registropropietariosController(VistaPrincipal, VistaIngresoPropietarios, ModeloRegistroPropietarios);
    }
    
}
