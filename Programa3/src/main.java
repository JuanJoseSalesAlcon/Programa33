
import Controladores.usuariosController;
import Modelos.usuariosModel;
import Vistas.frmPrincipal;
import Vistas.frmUsuarios;

public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmUsuarios VistaUsuarios = new frmUsuarios(VistaPrincipal,true);
        usuariosModel ModeloUsuarios = new usuariosModel();
        
        usuariosController ControladorUsuarios = new usuariosController(VistaPrincipal,VistaUsuarios,ModeloUsuarios);
    }
    
}
