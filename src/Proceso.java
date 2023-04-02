public class Proceso implements Comparable<Proceso> {
    private String nombreProceso;
    private String nombreUsuario;
    private int valorPrioridad;

    public Proceso(String nombreProceso, String nombreUsuario, int valorPrioridad) {
        this.nombreProceso = nombreProceso;
        this.nombreUsuario = nombreUsuario;
        this.valorPrioridad = valorPrioridad;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getValorPrioridad() {
        return valorPrioridad;
    }

    @Override
    public int compareTo(Proceso otro) {
        return Integer.compare(otro.valorPrioridad, valorPrioridad);
    }
}

