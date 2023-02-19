/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

