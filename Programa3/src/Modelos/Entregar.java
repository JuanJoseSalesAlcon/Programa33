package Modelos;
public class Entregar {
    String codigoEquipo;
    String nombrePersona;
    String fechaEntrega;
    String descripcionProblema;

    public Entregar(String codigoEquipo, String nombrePersona, String fechaEntrega, String descripcionProblema) {
        this.codigoEquipo = codigoEquipo;
        this.nombrePersona = nombrePersona;
        this.fechaEntrega = fechaEntrega;
        this.descripcionProblema = descripcionProblema;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getFechaEntrega() {
    
         return fechaEntrega;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }
    public String getDescripcionProblema() {
    
         return descripcionProblema;
    }
    public void setFechaEntrega(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }
     
}
