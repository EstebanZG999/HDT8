/**
 * A class that represents a process with a process name, user name and priority value.
 */
public class Proceso2 implements Comparable<Proceso2> {
    private String nombreDeProceso;
    private String nombreDeUsuario;
    private int numeroDePrioridad;

    /**
     * Constructs a new Process object with the given process name, user name and priority value.
     *
     * @param nombreDeProceso the name of the process
     * @param nombreDeUsuario the name of the user
     * @param numeroDePrioridad the priority value of the process
     */
    public Proceso2(String nombreDeProceso, String nombreDeUsuario, int numeroDePrioridad) {
        this.nombreDeProceso = nombreDeProceso;
        this.nombreDeUsuario = nombreDeUsuario;
        this.numeroDePrioridad = numeroDePrioridad;
    }

    /**
     * Returns the name of the process.
     *
     * @return the name of the process
     */
    public String getNombreDeProceso() {
        return nombreDeProceso;
    }

    /**
     * Returns the name of the user.
     *
     * @return the name of the user
     */
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    /**
     * Returns the priority value of the process.
     *
     * @return the priority value of the process
     */
    public int getNumeroDePrioridad() {
        return numeroDePrioridad;
    }

    /**
     * Compares this process with another process based on their priority values.
     *
     * @param otroProceso the other process to compare with
     * @return a negative integer, zero, or a positive integer as this process has a lower priority value,
     *         equal priority value, or higher priority value than the other process, respectively
     */
    @Override
    public int compareTo(Proceso2 otroProceso) {
        if (this.numeroDePrioridad < otroProceso.numeroDePrioridad) {
            return -1; // The other process has higher priority
        } else if (this.numeroDePrioridad > otroProceso.numeroDePrioridad) {
            return 1; // This process has higher priority
        } else {
            return 0; // The processes have the same priority
        }
    }
}

