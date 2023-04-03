/**
 * A class that represents a process with a name, user and priority value.
 */
public class Proceso implements Comparable<Proceso> {
    private String nombreProceso;
    private String nombreUsuario;
    private int valorPrioridad;

    /**
     * Constructs a new Process object with the given process name, user name and priority value.
     * @param nombreProceso the name of the process
     * @param nombreUsuario the name of the user
     * @param valorPrioridad the priority value of the process
     */
    public Proceso(String nombreProceso, String nombreUsuario, int valorPrioridad) {
        this.nombreProceso = nombreProceso;
        this.nombreUsuario = nombreUsuario;
        this.valorPrioridad = valorPrioridad;
    }

    /**
     * Returns the name of the process.
     * @return the name of the process
     */
    public String getNombreProceso() {
        return nombreProceso;
    }

    /**
     * Returns the name of the user.
     * @return the name of the user
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Returns the priority value of the process.
     * @return the priority value of the process
     */
    public int getValorPrioridad() {
        return valorPrioridad;
    }

    /**
     * Compares this process with another process based on their priority values.
     * @param otro the other process to compare with
     * @return a negative integer, zero, or a positive integer as this process has a lower priority value,
     * equal priority value, or higher priority value than the other process, respectively
     */
    @Override
    public int compareTo(Proceso otro) {
        return Integer.compare(otro.valorPrioridad, valorPrioridad);
    }
}

