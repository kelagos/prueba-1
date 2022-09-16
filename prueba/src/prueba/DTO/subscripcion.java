
package prueba.DTO;

import java.util.Date;

public class subscripcion {
    private int NumeroValidacion;
    private String Usuario;
    private Date FechaInicioSubscripcion;
    private int TotalSubscripcion;
    private String EquipoSuscribido;
    private int CorrelativoBoleta;
    
    
    public subscripcion (){
        this.NumeroValidacion=0;
        this.Usuario="";
        this.FechaInicioSubscripcion= new Date();
        this.TotalSubscripcion=0;
        this.EquipoSuscribido="";
        this.CorrelativoBoleta=0;
        
    }

    public int getNumeroValidacion() {
        return NumeroValidacion;
    }

    public void setNumeroValidacion(int NumeroValidacion) {
        this.NumeroValidacion = NumeroValidacion;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public Date getFechaInicioSubscripcion() {
        return FechaInicioSubscripcion;
    }

    public void setFechaInicioSubscripcion(Date FechaInicioSubscripcion) {
        this.FechaInicioSubscripcion = FechaInicioSubscripcion;
    }

    public int getTotalSubscripcion() {
        return TotalSubscripcion;
    }

    public void setTotalSubscripcion(int TotalSubscripcion) {
        this.TotalSubscripcion = TotalSubscripcion;
    }

    public String getEquipoSuscribido() {
        return EquipoSuscribido;
    }

    public void setEquipoSuscribido(String EquipoSuscribido) {
        this.EquipoSuscribido = EquipoSuscribido;
    }

    public int getCorrelativoBoleta() {
        return CorrelativoBoleta;
    }

    public void setCorrelativoBoleta(int CorrelativoBoleta) {
        this.CorrelativoBoleta = CorrelativoBoleta;
    }
    
    
    
}
