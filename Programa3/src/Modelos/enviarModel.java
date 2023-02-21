package Modelos;

import java.util.ArrayList;

/**
 *
 * @author USUARIO 2
 */
public class enviarModel {      
    public ArrayList<Enviar>EnviarEquipo = new ArrayList<Enviar>();
    
    
public void EnviarEquipo(String codigo, String descripcion, String tecnico, String fecha)
{
    Enviar nuevoEnviar = new Enviar(codigo, descripcion, tecnico, fecha);
    this.EnviarEquipo.add(nuevoEnviar);
}

public ArrayList ListarEnvios()
{
    return EnviarEquipo;
}

}
