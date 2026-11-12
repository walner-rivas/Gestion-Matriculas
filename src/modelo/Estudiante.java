package modelo;

public class Estudiante extends Persona {
    private String carnet;
    private String carrera;
    private int ciclo;

    public Estudiante() {
        super();
    }

    public Estudiante(String id, String nombres, String apellidos, String correo, String telefono, String carnet, String carrera, int ciclo) {
        super(id, nombres, apellidos, correo, telefono);
        this.carnet = carnet;
        this.carrera = carrera;
        this.ciclo = ciclo;
    }

    @Override
    public String obtenerResumen() {
        return "Estudiante [" + carnet + "] - " + getNombres() + " " + getApellidos() + " | Carrera: " + carrera + " (Ciclo " + ciclo + ")";
    }

    public String getCarnet() { return carnet; }
    public void setCarnet(String carnet) { this.carnet = carnet; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public int getCiclo() { return ciclo; }
    public void setCiclo(int ciclo) { this.ciclo = ciclo; }
}

