/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public void EnviarEquipo(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
