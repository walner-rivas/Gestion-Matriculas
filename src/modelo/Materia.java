package modelo;

public class Materia {
    private String codigo;
    private String nombre;
    private int unidadesValorativas;
    private int cupos;

    public Materia() {
    }

    public Materia(String codigo, String nombre, int unidadesValorativas, int cupos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidadesValorativas = unidadesValorativas;
        this.cupos = cupos;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getUnidadesValorativas() { return unidadesValorativas; }
    public void setUnidadesValorativas(int unidadesValorativas) { this.unidadesValorativas = unidadesValorativas; }

    public int getCupos() { return cupos; }
    public void setCupos(int cupos) { this.cupos = cupos; }
}
