
package prueba.DTO;

import java.util.Date;

public class club {
    private String CodigoClub;
    private String NombreClub;
    private String LemaClub;
    private int ValorSubscripcion;
    private String PaisOrigenClub;
    private Date AnhoCreacionClub;
    private String ColoresClub;
    private String NombreFundadorClub;
    
    public club (){
        this.CodigoClub="";
        this.NombreClub="";
        this.LemaClub="";
        this.ValorSubscripcion=0;
        this.PaisOrigenClub="";
        this.AnhoCreacionClub= new Date();
        this.ColoresClub="";
        this.NombreFundadorClub="";
        
        
    }

    public String getCodigoClub() {
        return CodigoClub;
    }

    public void setCodigoClub(String CodigoClub) {
        this.CodigoClub = CodigoClub;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getLemaClub() {
        return LemaClub;
    }

    public void setLemaClub(String LemaClub) {
        this.LemaClub = LemaClub;
    }

    public int getValorSubscripcion() {
        return ValorSubscripcion;
    }

    public void setValorSubscripcion(int ValorSubscripcion) {
        this.ValorSubscripcion = ValorSubscripcion;
    }

    public String getPaisOrigenClub() {
        return PaisOrigenClub;
    }

    public void setPaisOrigenClub(String PaisOrigenClub) {
        this.PaisOrigenClub = PaisOrigenClub;
    }

    public Date getAnhoCreacionClub() {
        return AnhoCreacionClub;
    }

    public void setAnhoCreacionClub(Date AnhoCreacionClub) {
        this.AnhoCreacionClub = AnhoCreacionClub;
    }

    public String getColoresClub() {
        return ColoresClub;
    }

    public void setColoresClub(String ColoresClub) {
        this.ColoresClub = ColoresClub;
    }

    public String getNombreFundadorClub() {
        return NombreFundadorClub;
    }

    public void setNombreFundadorClub(String NombreFundadorClub) {
        this.NombreFundadorClub = NombreFundadorClub;
    }
    
    
    
}
