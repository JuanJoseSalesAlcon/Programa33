package Modelos;
public class Enviar {
    String codigo;
    String descripcion;
    String tecnico;
    String fecha;

    public Enviar(String codigo, String descripcion, String tecnico) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tecnico = tecnico;
    }

    Enviar(String codigo, String descripcion, String tecnico, String fecha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
     public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    } 

}
