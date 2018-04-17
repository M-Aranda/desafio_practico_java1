
package datos;



public class Criminal extends SujetoSinRegistrar{
    
    private int ID;

    

    public Criminal(int ID, String nombre, String apellido, String sexo, String nacionalidad, String rut, String estado) {
        super(nombre, apellido, sexo, nacionalidad, rut, estado);
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
    public void setApellido(String apellido) {
        super.setApellido(apellido); 
    }

    @Override
    public String getApellido() {
        return super.getApellido(); 
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); 
    }

    @Override
    public String getNombre() {
        return super.getNombre(); 
    }
    
    
    
    
}
