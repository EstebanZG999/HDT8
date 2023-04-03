public class Proceso2 implements Comparable<Proceso2> {
    private String nombreDeProceso;
    private String nombreDeUsuario;
    private int numeroDePrioridad;

    public Proceso2(String nombreDeProceso, String nombreDeUsuario, int numeroDePrioridad) {
        this.nombreDeProceso = nombreDeProceso;
        this.nombreDeUsuario = nombreDeUsuario;
        this.numeroDePrioridad = numeroDePrioridad;
    }

    public String getNombreDeProceso() {
        return nombreDeProceso;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public int getNumeroDePrioridad() {
        return numeroDePrioridad;
    }

    @Override
    public int compareTo(Proceso2 otroProceso) {
        if (this.numeroDePrioridad < otroProceso.numeroDePrioridad) {
            return -1; // El otro proceso tiene mayor prioridad
        } else if (this.numeroDePrioridad > otroProceso.numeroDePrioridad) {
            return 1; // Este proceso tiene mayor prioridad
        } else {
            return 0; // Los procesos tienen la misma prioridad
        }
    }
}
