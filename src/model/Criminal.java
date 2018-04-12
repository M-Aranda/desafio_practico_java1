
package model;

public class Criminal {
    
    private String nombre;
    private String apellido;
    private String sexo;
    private String nacionalidad;
    private String rut;
    private String estado;
    
    public Criminal(){}

    public Criminal(String nombres, String apellidos, String sexo, String nacionalidad, String rut, String estado) {
        this.nombre = nombres;
        this.apellido = apellidos;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.rut = rut;
        this.estado = estado;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombres) {
        this.nombre = nombres;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
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
        return "Criminal{" + "nombres=" + nombre + ", apellidos=" + apellido + ", masculino=" + sexo + ", nacionalidad=" + nacionalidad + ", rut=" + rut + ", estado=" + estado + '}';
    }
    
 
    
    
}
