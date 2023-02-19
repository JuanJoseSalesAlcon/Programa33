/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class registropropietariosModel {
    public ArrayList<RegistroPropietarios>ListaPropietarios = new ArrayList<RegistroPropietarios>();
    
    public void AgregarPropietarios(String apellido, String nombre, String telefono)
{
    RegistroPropietarios NuevoIngresoPropietarios = new RegistroPropietarios(apellido, nombre, telefono);
    this.ListaPropietarios.add(NuevoIngresoPropietarios);
}
    
    public ArrayList ListarPropietarios()
    {
       return ListaPropietarios; 
    }

}