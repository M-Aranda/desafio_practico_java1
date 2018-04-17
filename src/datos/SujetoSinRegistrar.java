
package datos;

public class SujetoSinRegistrar {
    
    private String nombre;
    private String apellido;
    private String sexo;
    private String nacionalidad;
    private String rut;
    private String estado;
    
    public SujetoSinRegistrar(){}

    public SujetoSinRegistrar(String nombre, String apellido, String sexo, String nacionalidad, String rut, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.rut = rut;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Criminal{" + "nombre=" + nombre + ", apellido=" + apellido + ", masculino=" + sexo + ", nacionalidad=" + nacionalidad + ", rut=" + rut + ", estado=" + estado + '}';
    }
    
 
    
    
}
