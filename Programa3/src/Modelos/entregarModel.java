package Modelos;

import java.util.ArrayList;

public class entregarModel {      
public ArrayList<Entregar>ListarEntregas = new ArrayList<Entregar>();
    
public void AgregarEntrega(String codigoEquipo, String nombrePersona, String fechaEntrega, String descripcionProblema)
{
    Entregar NuevoEntregar = new Entregar(codigoEquipo, nombrePersona, fechaEntrega, descripcionProblema);
    this.ListarEntregas.add(NuevoEntregar);
}

public ArrayList ListarEntregas()
{
    return ListarEntregas;
}

}
