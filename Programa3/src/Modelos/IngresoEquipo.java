/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author umg
 */
public class IngresoEquipo {
    String marca;
    String modelo;
    String tipocomputadora;
    String problema;

    public IngresoEquipo(String marca, String modelo, String tipocomputadora, String problema) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipocomputadora = tipocomputadora;
        this.problema = problema;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipocomputadora() {
        return tipocomputadora;
    }

    public void setTipocomputadora(String tipocomputadora) {
        this.tipocomputadora = tipocomputadora;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    
}
