package modelo;

public class Matricula {
    private String idMatricula;
    private String carnetEstudiante;
    private String codigoMateria;
    private String fecha;
    private String estado;

    public Matricula() {
    }

    public Matricula(String idMatricula, String carnetEstudiante, String codigoMateria, String fecha, String estado) {
        this.idMatricula = idMatricula;
        this.carnetEstudiante = carnetEstudiante;
        this.codigoMateria = codigoMateria;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getIdMatricula() { return idMatricula; }
    public void setIdMatricula(String idMatricula) { this.idMatricula = idMatricula; }

    public String getCarnetEstudiante() { return carnetEstudiante; }
    public void setCarnetEstudiante(String carnetEstudiante) { this.carnetEstudiante = carnetEstudiante; }

    public String getCodigoMateria() { return codigoMateria; }
    public void setCodigoMateria(String codigoMateria) { this.codigoMateria = codigoMateria; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
