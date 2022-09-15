
package prueba.DTO;


public class usuario {
    private int Id;
    private int Run;
    private String Dv;
    private String NombreUsuario;
    private String NombreCompleto;
    private String Mail;
    private int Telefono;
    
    
    public usuario (){
        this.Id=0;
        this.Run=0;
        this.Dv="";
        this.NombreUsuario="";
        this.NombreCompleto="";
        this.Mail="";
        this.Telefono=0;
        
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getRun() {
        return Run;
    }

    public void setRun(int Run) {
        this.Run = Run;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if(NombreUsuario.length() > 4){
        this.NombreUsuario = NombreUsuario;    
        }
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        if (Mail.length() < 6){
        this.Mail = Mail;    
        } 
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        if(Telefono >9999999){
        this.Telefono = Telefono;
        }
    }
    
    
    
}
