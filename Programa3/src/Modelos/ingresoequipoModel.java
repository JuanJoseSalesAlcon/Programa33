package Modelos;

import java.util.ArrayList;

/**
 *
 * @author umg
 */
public class ingresoequipoModel {
    public ArrayList<IngresoEquipo>ListaIngresos = new ArrayList<IngresoEquipo>();
    
    
public void AgregarEquipo(String marca, String modelo, String tipocomputadora, String problema)
{
    IngresoEquipo NuevoIngresoEquipo = new IngresoEquipo(marca, modelo, tipocomputadora, problema);
    this.ListaIngresos.add(NuevoIngresoEquipo);
}

public ArrayList ListarIngresos()
{
    return ListaIngresos;
}

}

