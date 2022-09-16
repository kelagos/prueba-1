
package prueba.DTO;


public class usuario {
    private int Id;
    private int Run;
    private String Dv;
    private String NombreUsuario;
    private String NombreCompleto;
    private String Mail;
    private String Telefono;
    private String Clave;
    private String FechaNacimiento;
    
    
    public usuario (){
        this.Id=0;
        this.Run=0;
        this.Dv="";
        this.NombreUsuario="";
        this.NombreCompleto="";
        this.Mail="";
        this.Telefono="";
        this.Clave="";
        this.FechaNacimiento="";
        
        
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
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
        if (Mail.contains("@")&& (Mail.contains(".com") && (Mail.contains(".cl")))) {
        this.Mail = Mail;    
        } 
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        if(Telefono.length()>8 && Telefono.startsWith("56")){
            this.Telefono = Telefono;
        }
    }
    
    
    public boolean validarRun(int Run, char Dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; Run != 0; Run /= 10) {
                s = (s + Run % 10 * (9 - m++ % 6)) % 11;
            }
            if (Dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
        

    }
        
    
    public String iniciarSesion(String NombreUsuario, String Clave) {
        if (NombreUsuario.equals(this.NombreUsuario) && Clave.equals(this.Clave)) {
            return "Inicio de Sesion Correcto";
        } else {
            return "Usuario o Contraseña Incorrecta";
        }

    }        

    private Date validarFechaNacimiento(String fecha){
        Date FechaNacimiento = validarFecha(fecha);
        if(FechaNacimiento != null){
            Date actual = new Date();
            int anioNacimiento = FechaNacimiento.getYear();
            int anioActual = actual.getYear();
            if(anioActual - anioNacimiento > 17) {
                return FechaNacimiento;
            }
        }
        System.out.println("Fecha de nacimiento no valido: " + fecha); 
        return null;
    }
}