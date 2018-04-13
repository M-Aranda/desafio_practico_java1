
package model;


public class CriminalEnBD extends Criminal{
    
    private int ID;

    

    public CriminalEnBD(int ID, String nombres, String apellidos, String sexo, String nacionalidad, String rut, String estado) {
        super(nombres, apellidos, sexo, nacionalidad, rut, estado);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public void setEstado(String estado) {
        super.setEstado(estado); 
    }

    @Override
    public String getEstado() {
        return super.getEstado(); 
    }

    @Override
    public void setRut(String rut) {
        super.setRut(rut); 
    }

    @Override
    public String getRut() {
        return super.getRut(); 
    }

    @Override
    public void setNacionalidad(String nacionalidad) {
        super.setNacionalidad(nacionalidad);
    }

    @Override
    public String getNacionalidad() {
        return super.getNacionalidad(); 
    }

    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo); 
    }

    @Override
    public String getSexo() {
        return super.getSexo(); 
    }

    @Override
    public void setApellidos(String apellidos) {
        super.setApellidos(apellidos); 
    }

    @Override
    public String getApellidos() {
        return super.getApellidos(); 
    }

    @Override
    public void setNombres(String nombres) {
        super.setNombres(nombres); 
    }

    @Override
    public String getNombres() {
        return super.getNombres(); 
    }
    
    
    
    
}
